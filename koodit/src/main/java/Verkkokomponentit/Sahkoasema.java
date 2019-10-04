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
        //**palauttaa HashMapin sahkoaseman voimajohdoista**\\
        return this.voimajohtoLista;
    }
    public boolean onkoSahkotAsemalle(String sahkoasemanNimi){
        //**palauttaa arvon true jos kahden sähköaseman välisellä voimajohdolla on jännite**\\
        return this.voimajohtoLista.get(sahkoasemanNimi);
    }
    public boolean onkoVoimajohtoAsemalle(String sahkoasemanNimi){
        //** palauttaa rvon true jos kahden sähköaseman välillä on voimajohto**\\
        return this.voimajohtoLista.containsKey(sahkoasemanNimi);
    }
}