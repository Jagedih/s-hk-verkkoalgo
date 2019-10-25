package tietorakenteet;

/**
 *
 * @author Jagedih
 * @param <K>
 * @param <V>
 */
public class Hajautustaulu<K, V> {
    
    private Solmu<K,V>[] solmut;
    private int koko;

    /**
     *hajautustaulu kaarien lkm max 250000 -> hajautustaulu 280000
     */
    public Hajautustaulu(){
        solmut = new Solmu[280000]; 
    } 

    /**
     * Lisää avain-arvo parin hajautustauluun
     * @param avain solmun avain
     * @param arvo solmun arvo
     */
    public void lisaa(K avain, V arvo){
        
        Solmu lisattavaSolmu = new Solmu(avain, arvo);
        int hajautettuArvo = laskeHajautusarvo(avain);
        
        if(this.solmut[hajautettuArvo] == null){
            this.solmut[hajautettuArvo] = lisattavaSolmu;
            this.koko++;
        }
        else{
            Solmu solmu = this.solmut[hajautettuArvo];
            while(solmu.seuraava != null){
                solmu = solmu.seuraava;
            }
            solmu.seuraava = lisattavaSolmu;
            this.koko++;
        }
    }

    /**
     * palauttaa hajautustaulusta avaimen paikalle tallennetun arvon
     * @param avain solmun avain
     * @return palauttaa avainta vastaavan arvon taulusta
     */
    public V hae(K avain){
        int hArvo = laskeHajautusarvo(avain);
        Solmu solmu = this.solmut[hArvo];
        if(solmu == null){
            return null;
        }
        else{
            while(solmu != null){
                if(solmu.avain.equals(avain)){
                    return (V) solmu.getArvo();
                }
                solmu = solmu.seuraava;
            }
           return null;
        }
    }

    /**
     * Laskee hajautusarvon avaimelle
     * @param avain Solmun avain
     * @return avaimen hajautusarvo
     */
    public int laskeHajautusarvo(K avain){
        return avain.hashCode() % this.solmut.length;
    }

    /**
     * 
     * @return plauttaa avainjoukon
     */
    public Object[] avainSetti(){
        Object[] avaimet = new Object[koko];
        int k = 0;
        for(int i = 0; i < this.solmut.length; i++){
            
            if(this.solmut[i] == null){
            }
            else{
                Solmu solmu = solmut[i];
                avaimet[k]= solmu.avain;
                k++;
                while(solmu.seuraava != null){
                    solmu = solmu.seuraava;
                    avaimet[k]= solmu.avain;
                    k++;
                }
            }
        }
        return avaimet;
    } 

    /**
     * 
     * @param avain Solmun avain
     * @return palauttaa arvon true jos avain löytyy hajautustaulusta
     */
    public boolean onkoAvainTaulussa(K avain){
        return hae(avain) != null;
    }

    /**
     * 
     * @return palauttaa hajautusarvon koon
     */
    public int koko(){
        return this.koko; 
    }
}
