package Hakualgoritmit;

import Verkkokomponentit.Sahkoasema;
import Verkkokomponentit.Verkko;
import java.util.Stack;

public class Syvyyshaku {
    /**Syvyyshakualgoritmi joka hakee verkon yhtenäiset osat ja reitit**/
    private boolean[] vieraillutSolmut;
    private Stack<Sahkoasema> kaariPino;
    private Verkko verkko;
    int saarekeLkm=0;
    
    public Syvyyshaku(Verkko verkko){
        this.vieraillutSolmut = new boolean[verkko.sahkoasemalista.size()];
        this.verkko = verkko;
        this.kaariPino = new Stack<Sahkoasema>();
        
        for(int i=0; i < this.vieraillutSolmut.length; i++){
            if(this.vieraillutSolmut[i] != true){
                this.saarekeLkm++;
                System.out.print("Polku "+this.saarekeLkm);
                this.haeReititSolmustaX(Integer.toString(i));
            }
        }
    }
    private void haeReititSolmustaX(String solmu){
        String polku="\n";
        this.kaariPino.push(this.verkko.getSahkoasema(solmu));
        
        while(!kaariPino.empty()){
            Sahkoasema sahkoasema = kaariPino.pop();
            polku += sahkoasema.asemaNumero;
            this.vieraillutSolmut[Integer.parseInt(sahkoasema.asemaNumero)] = true;

            for(String asemanNimi : sahkoasema.voimajohtoLista.keySet()){
                if(sahkoasema.onkoSahkotAsemalle(asemanNimi) == true
                        && this.vieraillutSolmut[Integer.parseInt(asemanNimi)] == false){
                    
                    this.kaariPino.push(verkko.getSahkoasema(asemanNimi));
                }
            }
            polku += "->";
        }
        System.out.println(polku+"done");
    }
    public boolean onkoVerkkoYhtenainen(){
        return this.saarekeLkm == 1;
    }
}