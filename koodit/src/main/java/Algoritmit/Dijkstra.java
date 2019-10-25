
package Algoritmit;
import Verkkokomponentit.Sahkoasema;
import Verkkokomponentit.Verkko; 
import tietorakenteet.Pino;

/**
 * Tukii annetun
 * @author Jagedih
 */
public class Dijkstra {
    private final int[] etaisyydet;
    private final boolean[] vieraillutSolmut;
    private final Pino<Sahkoasema> kaariPino;
    private int[] reitti;
    private Verkko verkko;
    
    /**
     *
     * @param verkko luokan Verkko verkko
     */
    public Dijkstra(Verkko verkko){
        this.vieraillutSolmut = new boolean[verkko.sahkoasemalista.koko()];
        this.etaisyydet = new int[verkko.sahkoasemalista.koko()];
        this.reitti = new int[verkko.sahkoasemalista.koko()];
        this.verkko = verkko;
        this.kaariPino = new Pino<>();  
    }
    
    /**
     * 
     * @param solmu1 sahkoaseman tunnus
     * @param solmu2 sahkoaseman tunnus
     * @return
     */
    public int laskeEtaisyysSolmuille(String solmu1, String solmu2){
        //alustetaan etaisyydet ja vieraillut solmut jos useampi haku
        System.out.println("Etsitaan reitti solmusta " +solmu1 +" solmuun " + solmu2+":");
        for(int i = 0; i< this.etaisyydet.length; i++){
            this.etaisyydet[i] = Integer.MAX_VALUE;
            this.vieraillutSolmut[i] = false;
         }
            
         this.kaariPino.puske(this.verkko.getSahkoasema(solmu1));
         this.etaisyydet[Integer.parseInt(solmu1)] = 0;
         while(!kaariPino.onkoTyhja()){
             Sahkoasema sahkoasema = kaariPino.poistaYlin();
             if(sahkoasema.asemaNumero.equals(solmu2)){
                 break;
             }
             int asemanPaikka = Integer.parseInt(sahkoasema.asemaNumero);
             if(vieraillutSolmut[asemanPaikka] == true){
                 continue;
             }
             this.vieraillutSolmut[asemanPaikka] = true;
             
             for(Object vastaAsemanNimi : sahkoasema.voimajohtoLista.avainSetti()){
                 String nimi = (String)vastaAsemanNimi;
                 int vastaAsemanPaikka = Integer.parseInt(nimi);
                 
                 if(sahkoasema.onkoSahkotAsemalle(nimi) == true
                        && this.vieraillutSolmut[vastaAsemanPaikka] == false){
                       int nykyinen = etaisyydet[vastaAsemanPaikka];
                        int uusi = etaisyydet[asemanPaikka]+1;
                        if(uusi < nykyinen){
                            etaisyydet[vastaAsemanPaikka] = uusi;
                            this.kaariPino.puske(verkko.getSahkoasema(nimi));
                    }
                 }
             } 
         }
         return this.etaisyydet[Integer.parseInt(solmu2)];
         
    }

    /**
     * Tulostaa kahden verkon solmun etaisyydet (kaarien lkm)
     * @param solmu1 sahkoaseman tunnus
     * @param solmu2 sahkoaseman tunnus
     */
    public void tulostaEtaisyys(String solmu1, String solmu2){
        
        if(this.etaisyydet[Integer.parseInt(solmu2)] == Integer.MAX_VALUE){ 
             System.out.println("Ei yhteyttä solmusta " + solmu1 +" solmuun " + solmu2);
         }
         else{
             System.out.println("Etäisyys solmusta " + solmu1 +" solmuun " + 
                     solmu2 + " on " + this.etaisyydet[Integer.parseInt(solmu2)]);
         }   
    }
}
