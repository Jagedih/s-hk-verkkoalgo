
import Algoritmit.Syvyyshaku;
import SyoteGeneraattori.SyoteGen;
import Verkkokomponentit.Verkko;

public class main{
    
    public static void main(String [ ] args){
        //100 solmua, 300 kaarta, 70% todennäköisyys johdon sähköttömyydelle
        SyoteGen syotteet = new SyoteGen(100,300,70); 
        Verkko verkko = new Verkko();
        verkko.lataaSyote(syotteet.kaariLista);
        verkko.rakennaVerkko();
        Syvyyshaku syvyysAlgo = new Syvyyshaku(verkko);
        syvyysAlgo.tulostaAliverkot();
    }
}
