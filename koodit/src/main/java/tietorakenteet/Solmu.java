package tietorakenteet;

public class Solmu<K, V> {
    public final K avain;
    public final V arvo;
    public Solmu<K, V> seuraava;
    public Solmu<K, V> edellinen;
    
    public Solmu(K avain, V arvo){
        this.avain = avain;
        this.arvo = arvo;
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
