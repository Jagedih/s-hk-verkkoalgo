package Tietorakenteet;
import static org.junit.Assert.*;
import org.junit.Test;
import tietorakenteet.Solmu;

public class TestSolmu {
    
    @Test
    public void testSolmunRakenne(){
        Solmu solmu1 = new Solmu("1", true);
        Solmu solmu2 = new Solmu("2", false);
        solmu1.seuraava = solmu2;
        
        assertEquals(false, solmu1.equals(solmu2));
        assertEquals(true, solmu1.equals(solmu1));
        assertEquals(true, solmu1.arvo);
        assertEquals(false, solmu2.arvo); 
    }  
}
