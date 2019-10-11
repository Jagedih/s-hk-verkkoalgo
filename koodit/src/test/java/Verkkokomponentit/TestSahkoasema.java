package Verkkokomponentit;


import Verkkokomponentit.Sahkoasema;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestSahkoasema {
   
    Sahkoasema testiasema;
    public TestSahkoasema(){
        this.testiasema = new Sahkoasema("1");
        this.testiasema.lisaaVoimajohtoAsemalle("2", "1");
        this.testiasema.lisaaVoimajohtoAsemalle("3", "0");
    }
    @Test
    public void testVoimaJohtojenLisays(){
        assertEquals(true, this.testiasema.getVoimajohdotAsemalta().containsKey("2"));
        assertEquals(false, this.testiasema.getVoimajohdotAsemalta().containsKey("1"));
        assertEquals(true, this.testiasema.getVoimajohdotAsemalta().containsKey("3"));
    }
    @Test
    public void testJannite(){
        assertEquals(true, testiasema.onkoSahkotAsemalle("2"));
        assertEquals(false, testiasema.onkoSahkotAsemalle("3"));
    }
}
