package tietorakenteet;

/**
 *
 * @author Jagedih
 * @param <K> avaimen 
 * @param <V> arvo
 */
public class Solmu<K, V> {

   
    public final K avain;

    
    public final V arvo;

    /**
     * seuraava solmu
     */
    public Solmu<K, V> seuraava;

    /**
     * edellinen solmu
     */
    public Solmu<K, V> edellinen;
    
    /**
     *
     * @param avain solmun avaintunnus
     * @param arvo solmun arvo
     */
    public Solmu(K avain, V arvo){
        this.avain = avain;
        this.arvo = arvo;
    }

    /**
     *
     * @return
     */
    public V getArvo(){
        return this.arvo;
    }
    @Override
    public boolean equals(Object objekti) {
        Solmu toinen = (Solmu) objekti;
        return this.avain.equals(toinen.avain);
    }
    @Override
    public int hashCode(){
        return this.avain.hashCode();
    }
}
