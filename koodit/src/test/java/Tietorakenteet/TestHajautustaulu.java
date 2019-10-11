
package Tietorakenteet;
import org.junit.Test;
import tietorakenteet.Hajautustaulu;
import static org.junit.Assert.*;
public class TestHajautustaulu {
    
    @Test
    public void testHajautustaulu(){
        Hajautustaulu<String, String> testitaulu = new Hajautustaulu<>();
        testitaulu.lisaa("3", "0");
        testitaulu.lisaa("51", "2");
        
        //arvonhakutesti
        assertEquals(false, testitaulu.hae("3").equals("9"));
        assertEquals(true, testitaulu.hae("3").equals("0"));
        assertEquals(true, testitaulu.hae("51").equals("2"));
        assertEquals(false, testitaulu.hae("51").equals("3"));
        assertEquals(true, testitaulu.hae("3999") == null);
        
        //avaimenkyselytesti
        assertEquals(true, testitaulu.onkoAvainTaulussa("3"));
        assertEquals(true, testitaulu.onkoAvainTaulussa("51"));
        assertEquals(false, testitaulu.onkoAvainTaulussa("300"));
    }
    
}
