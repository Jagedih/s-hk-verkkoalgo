package tietorakenteet;

public class Hajautustaulu<K, V> {
    /**Oma hajautustaulu, taulussa ei ole poistoa koska sitä ei tarvita projektissa
     *hajautustaulun koko on asetettu 40000:n alkioon, koska projektissa käytetään 40000:aa solmua
     **/
    
    private final Solmu<K,V>[] solmut;
    public Hajautustaulu(){
        solmut = new Solmu[100000]; //koko konstruktoriin jossain välissä?
    } 
    public void lisaa(K avain, V arvo){
        /**Lisää avain-arvoparin hajautustauluun**/
        Solmu lisattavaSolmu = new Solmu(avain, arvo);
        int hajautettuArvo = laskeHajautusarvo(avain);
        
        if(this.solmut[hajautettuArvo] == null){
            this.solmut[hajautettuArvo] = lisattavaSolmu;
        }
        else{
            Solmu solmu = this.solmut[hajautettuArvo];
            while(solmu.seuraava != null){
                solmu = solmu.seuraava;
            }
            solmu.seuraava = lisattavaSolmu;
        }
    }
    public Object hae(K avain){
        //**palauttaa hajautustaulusta avaimen paikalle tallennetun arvon**/
        int hArvo = laskeHajautusarvo(avain);
        Solmu solmu = this.solmut[hArvo];
        if(solmu == null){
            return null;
        }
        else{
            while(solmu != null){
                if(solmu.avain.equals(avain)){
                    return solmu.arvo;
                }
                solmu = solmu.seuraava;
            }
           return null;
        }
    }
    public int laskeHajautusarvo(K avain){
        /**palauttaa avainta vastaavan hajautusaron**/
        return avain.hashCode() % this.solmut.length;
    }
    public boolean onkoAvainTaulussa(K avain){
        return hae(avain) != null;
    }
}
