package Verkkokomponentit;
import java.util.HashMap;
public class Sahkoasema {
    
    public String asemaNumero;
    public HashMap<String,Boolean> voimajohtoLista;
    
    public Sahkoasema(String numero){
        this.asemaNumero = numero;
        this.voimajohtoLista = new HashMap<>();
    }
    public void lisaaVoimajohtoAsemalle(String voimajohto, String jannite){
        this.voimajohtoLista.put(voimajohto, !jannite.equals("0"));
    }
    public HashMap<String,Boolean> getVoimajohdotAsemalta(){
        return this.voimajohtoLista;
    }
    public boolean onkoSahkotAsemalle(String avain){
        return this.voimajohtoLista.get(avain);
    }
}
