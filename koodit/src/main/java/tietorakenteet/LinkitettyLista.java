package tietorakenteet;
public class LinkitettyLista<K, V> {
    //**Itsetoteutettu LinkitettyLista**//
    private final K avain;
    private final V arvo;
    LinkitettyLista<K,V> seuraavaSolmu;
    
    public LinkitettyLista(K avain, V arvo){
        this.avain = avain;
        this.arvo = arvo;
    }
    //setterit
    public void setSeuraavaSolmu(LinkitettyLista<K, V> seuraavaSolmu){
        this.seuraavaSolmu = seuraavaSolmu;
    }
    //getterit
    public V getArvo(){
        return this.arvo;
    }
    public boolean onkoSeuraavaa(){
        return this.seuraavaSolmu != null;
    }
    public K getAvain(){
        return this.avain;
    }
    public LinkitettyLista<K,V> getSeuraavaSolmu(){
        return this.seuraavaSolmu;
    }
    
    
}
