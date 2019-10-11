
import Algoritmit.Syvyyshaku;
import SyoteGeneraattori.SyoteGen;
import Verkkokomponentit.Verkko;

public class Main{
    
    public static void main(String [ ] args){
        //10000 solmua, 30000 kaarta, 70% todennäköisyys voimajohdon sähköttömyydelle
        SyoteGen syotteet = new SyoteGen(10000,30000,70); 
        Verkko verkko = new Verkko();
        verkko.lataaSyote(syotteet.kaariLista);
        verkko.rakennaVerkko();
        Syvyyshaku syvyysAlgo = new Syvyyshaku(verkko);
        syvyysAlgo.tulostaAliverkot();
    }
}
