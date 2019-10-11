package Algoritmit;


import Algoritmit.Syvyyshaku;
import Verkkokomponentit.Verkko;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestSyvyyshaku {
    Verkko verkko;
    String[] testiData;
    
    @Test
    public void testaaRikkinainenVerkko(){
        
        this.testiData= new String[5];
        this.testiData[0] = "0-1:0";
        this.testiData[1] = "1-2:1";
        this.testiData[2] = "2-3:1";
        this.testiData[3] = "3-4:1";
        this.testiData[4] = "4-5:0";
        this.verkko = new Verkko();
        this.verkko.lataaSyote(this.testiData);
        this.verkko.rakennaVerkko();
        Syvyyshaku syvyyshaku = new Syvyyshaku(this.verkko);
        assertEquals(false, syvyyshaku.onkoVerkkoYhtenainen()); 
    }
    @Test
    public void testaaYhtenainenVerkko(){
        this.testiData= new String[8];
        this.testiData[0] = "0-1:0";
        this.testiData[1] = "1-2:1";
        this.testiData[2] = "2-3:1";
        this.testiData[3] = "3-4:1";
        this.testiData[4] = "4-5:1";
        this.testiData[5] = "5-6:0";
        this.testiData[6] = "3-6:1";
        this.testiData[7] = "0-2:1";
        this.verkko = new Verkko();
        this.verkko.lataaSyote(this.testiData);
        this.verkko.rakennaVerkko();
        Syvyyshaku syvyyshaku = new Syvyyshaku(this.verkko);
        assertEquals(true, syvyyshaku.onkoVerkkoYhtenainen());
    }
            
}
