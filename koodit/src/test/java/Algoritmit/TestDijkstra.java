
package Algoritmit;

import Verkkokomponentit.Verkko;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestDijkstra {
    Verkko verkko;
    String[] testiData;
    
    @Test
    public void testaaDijkstraYhtenainenVerkko(){
        
        this.testiData= new String[9];
        this.testiData[0] = "0-1:1";
        this.testiData[2] = "2-3:1";
        this.testiData[5] = "2-5:1";
        this.testiData[4] = "4-5:1";
        this.testiData[3] = "3-4:1";
        this.testiData[6] = "3-5:1";
        this.testiData[8] = "6-7:1";
        this.testiData[7] = "0-5:1";
        this.testiData[1] = "1-2:1";
        
        this.verkko = new Verkko();
        this.verkko.lataaSyote(this.testiData);
        this.verkko.rakennaVerkko();
        Dijkstra dijkstra = new Dijkstra(this.verkko);
        assertEquals(true, dijkstra.laskeEtaisyysSolmuille("0", "5") == 1); //solmusta 0 on 3 eri pituutta solmuun viisi, lyhin 1
        assertEquals(true, dijkstra.laskeEtaisyysSolmuille("0","7") == Integer.MAX_VALUE);
    }
    @Test
    public void testaaDijkstraRikkinainenVerkko(){
        
        this.testiData= new String[9];
        this.testiData[0] = "0-1:1";
        this.testiData[2] = "2-3:1";
        this.testiData[5] = "2-5:1";
        this.testiData[4] = "4-5:1";
        this.testiData[3] = "3-4:1";
        this.testiData[6] = "3-5:1";
        this.testiData[8] = "6-7:1";
        this.testiData[7] = "0-5:0";
        this.testiData[1] = "1-2:1";
        this.verkko = new Verkko();
        this.verkko.lataaSyote(this.testiData);
        this.verkko.rakennaVerkko();
        Dijkstra dijkstra = new Dijkstra(this.verkko);
        assertEquals(true, dijkstra.laskeEtaisyysSolmuille("0", "5") == 3); //solmusta 0 on 3 eri pituutta solmuun viisi, lyhin yhteys poikki
    }
}
