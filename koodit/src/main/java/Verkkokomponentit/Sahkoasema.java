package Verkkokomponentit;
import tietorakenteet.Hajautustaulu;

/**
 *
 * @author Jagedih
 */
public class Sahkoasema {
    
   
    public String asemaNumero;
    public Hajautustaulu<String,Boolean> voimajohtoLista;
    
    public Sahkoasema(String numero){
        this.asemaNumero = numero;
        this.voimajohtoLista = new Hajautustaulu<>();
    }

    /**
     *
     * @param voimajohto voimajohdon tunnus
     * @param jannite voimajohdon jannitelita 0 = true, 1 = false
     */
    public void lisaaVoimajohtoAsemalle(String voimajohto, String jannite){
        this.voimajohtoLista.lisaa(voimajohto, !jannite.equals("0"));
    }
    public Hajautustaulu<String,Boolean> getVoimajohdotAsemalta(){
        //**palauttaa HashMapin sahkoaseman voimajohdoista**\\
        return this.voimajohtoLista;
    }

    /**
     *
     * @param sahkoasemanNimi sahkoaseman tunnus eli asemanumero
     * @return palauttaa arvon true jos annetun sähköaseman kaaren paino on 1
     */
    public boolean onkoSahkotAsemalle(String sahkoasemanNimi){
        //**palauttaa arvon true jos kahden sähköaseman välisellä voimajohdolla on jännite**\\
        return this.voimajohtoLista.hae(sahkoasemanNimi);
    }
    /**
     *
     * @param sahkoasemanNimi sahkoaseman tunnus eli asemanumero
     * @return palauttaa arvon true jos annettulle sähköasemalle on kaari
     */
    public boolean onkoVoimajohtoAsemalle(String sahkoasemanNimi){
        //** palauttaa rvon true jos kahden sähköaseman välillä on voimajohto**\\
        return this.voimajohtoLista.onkoAvainTaulussa(sahkoasemanNimi);
    }
}