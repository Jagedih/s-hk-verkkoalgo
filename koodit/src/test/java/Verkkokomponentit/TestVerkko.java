package Verkkokomponentit;

import Verkkokomponentit.Verkko;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestVerkko {
    String[] testiData;
    Verkko verkko;
    
    public TestVerkko(){
        this.testiData= new String[5];
        this.testiData[0] = "1-6:0";
        this.testiData[1] = "200-4:1";
        this.testiData[2] = "1-9:0";
        this.testiData[3] = "10-7:1";
        this.testiData[4] = "10-11:0";
        this.verkko = new Verkko();
        verkko.lataaSyote(this.testiData);
        verkko.rakennaVerkko();
    }
    @Test
    public void testAsemienLisays(){
        assertEquals(true, this.verkko.onkoAsemaListalla("1"));
        assertEquals(false, this.verkko.onkoAsemaListalla("300")); 
        assertEquals(true, verkko.onkoAsemaListalla("200")); 
        assertEquals(true, verkko.onkoAsemaListalla("11"));
    }
    @Test
    public void testGetter(){
        assertEquals(true, this.verkko.getSahkoasema("1").asemaNumero.equals("1"));
    }
}
