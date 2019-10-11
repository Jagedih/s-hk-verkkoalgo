package Verkkokomponentit;
import java.util.HashMap;

public class Verkko {
    public HashMap<String, Sahkoasema> sahkoasemalista;
    String[] syotteet;

    public Verkko(){
    this.sahkoasemalista = new HashMap<>();
    }
    public void rakennaVerkko(){
        /**Rakentaa verkon kaaridatasta**/
        
        for(String kaari : this.syotteet){
            String asema1 = kaari.substring(0, kaari.indexOf("-"));
            String asema2 = kaari.substring(kaari.indexOf("-")+1,kaari.indexOf(":"));
            String jannite = kaari.substring(kaari.indexOf(":")+1);
            
            if(!this.sahkoasemalista.containsKey(asema1)){
                this.sahkoasemalista.put(asema1, new Sahkoasema(asema1));
            }
            if(!this.sahkoasemalista.containsKey(asema2)){
                this.sahkoasemalista.put(asema2, new Sahkoasema(asema2));
            }
            this.sahkoasemalista.get(asema1).lisaaVoimajohtoAsemalle(asema2,jannite);
            this.sahkoasemalista.get(asema2).lisaaVoimajohtoAsemalle(asema1, jannite);
        }
    }
    public void lataaSyote(String[] syoteData){
        /**Lataa malliin kaaridatan, jota käytetään verkon rakentamisessa*
         **/
        this.syotteet = syoteData;
    }
    public HashMap getSahkoasemalista(){
        /**Palauttaa hajautustaulun verkon sähköasemista**/
        return this.sahkoasemalista;
    }
    public Sahkoasema getSahkoasema(String avain){
        /**Palauttaa avainta vastaavan sähköasemaobjektin*
         **/
        return this.sahkoasemalista.get(avain);
    }
    public boolean onkoAsemaListalla(String avain){
        /**Palauttaa avainta vastaavan sähköasemaobjekti on listalla*
         **/
        return this.sahkoasemalista.containsKey(avain);
    }
}