package tietorakenteet;

public class HajautusTaulu<K, V> {
    private LinkitettyLista<K,V>[] linkitetytListat;
    
    public HajautusTaulu(){
        linkitetytListat = new LinkitettyLista[50];
    } 
    public void lisaa(K avain, V arvo){
        int hajautettuArvo = hajautaArvo(avain);
    }
    public int hajautaArvo(K avain){
        return avain.hashCode() % linkitetytListat.length;
    }
    
}
