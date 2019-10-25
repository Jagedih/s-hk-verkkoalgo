package Algoritmit;

import Verkkokomponentit.Sahkoasema;
import Verkkokomponentit.Verkko;
import java.util.HashSet;
import tietorakenteet.Pino;

/**
 * Syvyyshakualgoritmi joka hakee verkon yhtenäiset osat ja reitit
 * @author Jagedih
 */
public class Syvyyshaku {
    private boolean[] vieraillutSolmut;
    private Pino<Sahkoasema> kaariPino;
    private Pino<HashSet> aliverkot;
    private Verkko verkko;
    int saarekeLkm=0;
    
    /**
     *
     * @param verkko luokan Verkko verkko jota tutkitaan syvyyshaulla
     */
    public Syvyyshaku(Verkko verkko){
        System.out.println("Sahkoverkon saarekkeet (yhtenäiset osat)");
        this.vieraillutSolmut = new boolean[verkko.sahkoasemalista.koko()];
        this.verkko = verkko;
        this.kaariPino = new Pino<>();
        this.aliverkot = new Pino<>();
        
        for(int i=0; i < this.vieraillutSolmut.length; i++){
            if(this.vieraillutSolmut[i] != true){
                this.saarekeLkm++;
                this.haeReititSolmusta(Integer.toString(i));
            }
        }
    }
    private void haeReititSolmusta(String solmu){
        String saareke = "{";
        HashSet<String> aliverkko = new HashSet<>();
        this.kaariPino.puske(this.verkko.getSahkoasema(solmu));
        
        while(!kaariPino.onkoTyhja()){
            Sahkoasema sahkoasema = kaariPino.poistaYlin();
            saareke += " "+ sahkoasema.asemaNumero;
            aliverkko.add(sahkoasema.asemaNumero);
            this.vieraillutSolmut[Integer.parseInt(sahkoasema.asemaNumero)] = true;

            for(Object vastaAsemanNimi : sahkoasema.voimajohtoLista.avainSetti()){
                String nimi = (String) vastaAsemanNimi;
                if(sahkoasema.onkoSahkotAsemalle(nimi) == true
                        && this.vieraillutSolmut[Integer.parseInt(nimi)] == false){
                    this.kaariPino.puske(verkko.getSahkoasema(nimi));
                }
            }
        }
        saareke += " }";
        System.out.println(saareke);
        this.aliverkot.puske(aliverkko);
    }

    /**
     *
     * @return Palauttaa pinon aliverkoista
     */
    public Pino<HashSet> getAliverkot(){
        return this.aliverkot;
    }

    /**
     *
     * @return palauttaa arvon true jos verkko on yhtenäinen
     */
    public boolean onkoVerkkoYhtenainen(){
        return this.saarekeLkm == 1;
    }
}