import SyoteGeneraattori.SyoteGen;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestSyoteG {
    SyoteGen syoteGen;
    
    public TestSyoteG(){
        this.syoteGen = new SyoteGen(300,500,30);
    }
    @Test
    public void testYhtenaisyys(){
        /**Tarkastaa onko verkko yhtenäinen, verkon runko on 
         * rakennettu liittämällä yksi verkon solmu kerrallaan rakennetun verkon perään,
         joten verkon runko on yhtenäinen jos kaarien päistä löytyvät samat solmupisteet
         esim 2 liitetään 1 ja 3 liitetään 2 jne**/
        
        for(int i = 1; i < 299; i++){
            /*solmujen määrä 300 ja verkon rakentaminen aloitetaan yhtenaisen verkon rakentamisesta*/
            int alkuI = this.syoteGen.kaariLista[i-1].indexOf("-")+1;
            int loppuI = this.syoteGen.kaariLista[i-1].indexOf(":");
            String edellisenKaarenLiitossolmu = syoteGen.kaariLista[i-1].substring(alkuI,loppuI);
           
            alkuI = 0;
            loppuI = syoteGen.kaariLista[i].indexOf("-");
            String seuraavanKaarenLiitossolmu = syoteGen.kaariLista[i].substring(alkuI,loppuI);
            assertEquals(true, edellisenKaarenLiitossolmu.equals(seuraavanKaarenLiitossolmu));
        }
    }
    @Test
    public void testKaariMaara(){
        for(String kaari : this.syoteGen.kaariLista){
            assertEquals(true, kaari != null);
        }
    }
}
