import static org.junit.Assert.*;
import org.junit.Test;
public class TestSahkoasema {

    @Test
    public void testSahkoasemanJannite() {
        
        Sahkoasema testiSahkoasema = new Sahkoasema("testi");
        Voimajohto testijohto1 = new Voimajohto(new Sahkoasema("1"), new Sahkoasema("2"), false);
        Voimajohto testijohto2 = new Voimajohto(new Sahkoasema("2"), new Sahkoasema("3"), false);
        Voimajohto testijohto3 = new Voimajohto(new Sahkoasema("4"), new Sahkoasema("5"), true);
        testiSahkoasema.lisaaVoimajohto(testijohto1);

        assertEquals(false, testiSahkoasema.tarkastaAsemanJannite());
        testiSahkoasema.lisaaVoimajohto(testijohto2);
        assertEquals(false, testiSahkoasema.tarkastaAsemanJannite());
        testiSahkoasema.lisaaVoimajohto(testijohto3);
        assertEquals(true, testiSahkoasema.tarkastaAsemanJannite());
        }
}
