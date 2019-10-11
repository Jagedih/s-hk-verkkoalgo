package Tietorakenteet;

import org.junit.Test;
import static org.junit.Assert.*;
import tietorakenteet.Pino;

public class TestPino {
    @Test
    public void testPinonLisaysJaPoisto(){
        Pino<Integer> testiPino = new Pino<>();
        testiPino.puske(3);
        testiPino.puske(2);
        testiPino.puske(1);
        assertEquals(true, testiPino.poistaYlin() == 1);
        assertEquals(true, testiPino.poistaYlin() == 2);
        assertEquals(true, testiPino.poistaYlin() == 3);
        assertEquals(true, testiPino.poistaYlin() == null);
        testiPino.puske(3);
        testiPino.puske(2);
        testiPino.puske(1);
        assertEquals(true, testiPino.poistaYlin() == 1);
        assertEquals(true, testiPino.poistaYlin() == 2);
        assertEquals(true, testiPino.poistaYlin() == 3);
        assertEquals(true, testiPino.poistaYlin() == null);
    }
    @Test
    public void testPinonKasvatus(){
        Pino<Integer> testiPino = new Pino<>();
        for(int i =0; i< 300; i++){
            testiPino.puske(i);
        }
        assertEquals(true, testiPino.poistaYlin() == 299);
        
    }
    @Test
    public void testPinonKoko(){
        Pino<Integer> testiPino = new Pino<>();
        for(int i =0; i< 50; i++){
            testiPino.puske(i);
        }
        assertEquals(true, testiPino.getKoko() == 50);
        
        for(int i =0; i< 25; i++){
            testiPino.poistaYlin();
        }
        assertEquals(true, testiPino.getKoko() == 25);
    }
}