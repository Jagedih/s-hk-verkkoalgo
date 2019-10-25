package Verkkokomponentit;
import tietorakenteet.Hajautustaulu;

/**
 *Sahkoverkkoa simuloiva tietorakenne, rakentaa verkon SyoteGen kaaridatasta
 * @author Jagedih
 */
public class Verkko {
    public Hajautustaulu<String, Sahkoasema> sahkoasemalista;
    String[] syotteet;
    
    public Verkko(){
    this.sahkoasemalista = new Hajautustaulu<>();
    }

    /**
     *Rakentaa verkon kaaridatasta
     */
    public void rakennaVerkko(){
        
        
        for(String kaari : this.syotteet){
            String asema1 = kaari.substring(0, kaari.indexOf("-"));
            String asema2 = kaari.substring(kaari.indexOf("-")+1,kaari.indexOf(":"));
            String jannite = kaari.substring(kaari.indexOf(":")+1);
            
            if(!this.sahkoasemalista.onkoAvainTaulussa(asema1)){
                this.sahkoasemalista.lisaa(asema1, new Sahkoasema(asema1));
            }
            if(!this.sahkoasemalista.onkoAvainTaulussa(asema2)){
                this.sahkoasemalista.lisaa(asema2, new Sahkoasema(asema2));
            }
            
            this.sahkoasemalista.hae(asema1).lisaaVoimajohtoAsemalle(asema2,jannite);
            this.sahkoasemalista.hae(asema2).lisaaVoimajohtoAsemalle(asema1, jannite);
        }
    }

    /**
     * Lataa malliin kaaridatan, jota käytetään verkon rakentamisessa
     * @param syoteData SyoteGen luokalla tuotettu lista verkon kaarista
     */
    public void lataaSyote(String[] syoteData){
        this.syotteet = syoteData;
    }

    /**
     *
     * @return Palauttaa hajautustaulun verkon sähköasemista
     */
    public Hajautustaulu getSahkoasemalista(){
        return this.sahkoasemalista;
    }

    /**
     *
     * @param avain Sahkoaseman avain eli asematunnus
     * @return palauttaa avainta vastaavan Sahkoaseman
     */
    public Sahkoasema getSahkoasema(String avain){
        return this.sahkoasemalista.hae(avain);
    }

    /**
     *
     * @param avain Sahkoaseman avain eli asematunnus
     * @return palauttaa arvon true jos sahkoasema verkon sahkoasemalistalta
     */
    public boolean onkoAsemaListalla(String avain){
        return this.sahkoasemalista.onkoAvainTaulussa(avain);
    }
}