
import java.util.ArrayList;

public class Sahkoasema {
    private ArrayList<Voimajohto> voimajohdot;
    private final String nimi;
    
    public Sahkoasema(String annettuNimi){
        /**simuloidun sähköverkon solmupiste jonka kaaria ovat voimajohdot**/
        this.voimajohdot = new ArrayList<>();
        this.nimi = annettuNimi;
    }
    public void lisaaVoimajohto(Voimajohto voimajohto){
        /**lisää voimajohdon asemaan**/
        this.voimajohdot.add(voimajohto);
    }
    public boolean tarkastaAsemanJannite(){
        /**Jos jollain sähköasemaan yhtyneella johdolla on sähköä, tällä asemalla on sähköä**/
        for(Voimajohto voimajohto : voimajohdot){
            if(voimajohto.onkoKatkaisijatKiinni() == true){
                return true;
            }
        }
        return false;     
    }
}
