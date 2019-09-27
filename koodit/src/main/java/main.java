
import Hakualgoritmit.Syvyyshaku;
import SyoteGeneraattori.SyoteGen;
import Verkkokomponentit.Verkko;

public class main{
    
    public static void main(String [ ] args){
        
        SyoteGen syotteet = new SyoteGen(300,500,0); //kaikilla kaarilla yhteys  verkkoon
        Verkko verkko = new Verkko();
        verkko.lataaSyote(syotteet.kaariLista);
        verkko.rakennaVerkko();
        Syvyyshaku syvyysAlgo = new Syvyyshaku(verkko);
        System.out.println("---------------------------------------------");
        syotteet = new SyoteGen(300,500,30); //30% todennäköisyys että voimajohdolla ei ole sähköä
        verkko = new Verkko();
        verkko.lataaSyote(syotteet.kaariLista);
        verkko.rakennaVerkko();
        syvyysAlgo = new Syvyyshaku(verkko);
        
    }
}
