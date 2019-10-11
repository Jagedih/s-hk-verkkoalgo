
import Algoritmit.Syvyyshaku;
import SyoteGeneraattori.SyoteGen;
import Verkkokomponentit.Verkko;

public class Main{
    
    public static void main(String [ ] args){
        //500 solmua, 2000 kaarta, 70% todennäköisyys voimajohdon sähköttömyydelle
        SyoteGen syotteet = new SyoteGen(100000,300000,70); 
        Verkko verkko = new Verkko();
        verkko.lataaSyote(syotteet.kaariLista);
        verkko.rakennaVerkko();
        Syvyyshaku syvyysAlgo = new Syvyyshaku(verkko);
        syvyysAlgo.tulostaAliverkot();
    }
}