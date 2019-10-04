package Algoritmit;

import Verkkokomponentit.Sahkoasema;
import Verkkokomponentit.Verkko;
import java.util.HashSet;
import java.util.Stack;

public class Syvyyshaku {
    /**Syvyyshakualgoritmi joka hakee verkon yhtenäiset osat ja reitit**/
    private boolean[] vieraillutSolmut;
    private Stack<Sahkoasema> kaariPino;
    private Stack<HashSet> aliverkot;
    private Verkko verkko;
    int saarekeLkm=0;
    
    public Syvyyshaku(Verkko verkko){
        this.vieraillutSolmut = new boolean[verkko.sahkoasemalista.size()];
        this.verkko = verkko;
        this.kaariPino = new Stack<>();
        this.aliverkot = new Stack<>();
        
        for(int i=0; i < this.vieraillutSolmut.length; i++){
            if(this.vieraillutSolmut[i] != true){
                this.saarekeLkm++;
                this.haeReititSolmusta(Integer.toString(i));
            }
        }
    }
    private void haeReititSolmusta(String solmu){
        HashSet<String> aliverkko = new HashSet<>();
        this.kaariPino.push(this.verkko.getSahkoasema(solmu));
        
        while(!kaariPino.empty()){
            Sahkoasema sahkoasema = kaariPino.pop();
            aliverkko.add(sahkoasema.asemaNumero);
            this.vieraillutSolmut[Integer.parseInt(sahkoasema.asemaNumero)] = true;

            for(String vastaAsemanNimi : sahkoasema.voimajohtoLista.keySet()){
                if(sahkoasema.onkoSahkotAsemalle(vastaAsemanNimi) == true
                        && this.vieraillutSolmut[Integer.parseInt(vastaAsemanNimi)] == false){
                    this.kaariPino.push(verkko.getSahkoasema(vastaAsemanNimi));
                }
            }
        }
        this.aliverkot.add(aliverkko);
    }
    public Stack<HashSet> getAliverkot(){
        return this.aliverkot;
    }
    public void tulostaAliverkot(){
        for(int i=0; i < this.aliverkot.size();i++){
            String tuloste = "";
            for(Object sahkoasema : this.aliverkot.get(i)){
                tuloste += " -> " + sahkoasema;
            }
            System.out.println((i+1) + " Saareke:" +tuloste);
        }
    }
    public boolean onkoVerkkoYhtenainen(){
        return this.saarekeLkm == 1;
    }
}