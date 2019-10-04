package SyoteGeneraattori;

import java.util.Random;

public final class SyoteGen {
    /**Luo yhtenäisen verkon kaaridatan projektille**/
    Random lukuGen = new Random();
    int[] solmut;
    public String[] kaariLista;
    int[] solmujenKaariLkm;
    int p;
    
    public SyoteGen(int solmujenMaara, int kaarienMaara, int p){
        /*luku p:tä käytetään kaaren painon arvonnassa, p:tä verrataan 
        arvottuun lukuun 0-100 välillä. Paino on voimajohdon jännitetila
        */
        
        this.solmut = new int[solmujenMaara];
        this.solmujenKaariLkm = new int[solmujenMaara];
        this.kaariLista = new String[kaarienMaara];
        this.p = p;
        
        for(int i = 0; i < solmujenMaara; i++){
            this.solmut[i] = i;
        }
        for(int i = 0; i < solmujenMaara-1/2; i++){
            int solmu1 = lukuGen.nextInt(solmujenMaara-1);
            int solmu2 = lukuGen.nextInt(solmujenMaara-1);
            int bufferi = this.solmut[solmu1];
            this.solmut[solmu1] = this.solmut[solmu2];
            this.solmut[solmu2] = bufferi;
        }
        this.rakennaYhtenaisetKaaret();
        this.lisaaVerkonLiitannaisyytta();
   }
    public void rakennaYhtenaisetKaaret(){
        /**Rakentaa yhtenaisen verkon annetulle solmumäärälle, solmujen välillä 
        * on yksi kaari ja solmut ovat satunnaisessa järjestyksessä**/
        int solmu1, solmu2;
        for(int i = 1; i < this.solmut.length; i++){
            solmu1 = this.solmut[i-1];
            solmu2 = this.solmut[i];
            this.solmujenKaariLkm[solmu1] += 1;
            this.solmujenKaariLkm[solmu2] += 1;
            this.kaariLista[i-1] =(solmu1 + "-" + solmu2 +":" +arvoSahkolinjanJannite());
        }
    }
    public void lisaaVerkonLiitannaisyytta(){
        /**Lisää yhtenäisen verkon runkoon kaaren kahden verkon solmun välille 
         * jos solmuilla on alle 4 kaarta**/
       System.out.println("lisataan");
       int i = this.solmut.length-1;
       while(i < this.kaariLista.length){
           int satunnainenSolmu1 = lukuGen.nextInt(this.solmut.length-1);
           int satunnainenSolmu2 = lukuGen.nextInt(this.solmut.length-1);
           if(satunnainenSolmu1 != satunnainenSolmu2){
               this.kaariLista[i] = satunnainenSolmu1 + "-" + satunnainenSolmu2 +":"+arvoSahkolinjanJannite();
               this.solmujenKaariLkm[satunnainenSolmu1] +=1;
               this.solmujenKaariLkm[satunnainenSolmu2] +=1;
               i++;
           }
       }
       System.out.println("lopetetaan");
    }
    public int arvoSahkolinjanJannite(){
        /**Arpoo kaaren painon, mikä kuvaa voimajohdon tilaa (joko siinä kulkee sähköä tai ei)**/
        if( lukuGen.nextInt(100) < this.p){
            return 0;
        }
        else{
            return 1;
        }
   }
}
