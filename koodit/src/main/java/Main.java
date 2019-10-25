
import Algoritmit.Dijkstra;
import Algoritmit.Syvyyshaku;
import SyoteGeneraattori.SyoteGen;
import Verkkokomponentit.Verkko;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Jagedih
 */

public class Main{
    
    public static void main(String [ ] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int vast = -1;
        while(vast != 0){
            int solmut = -1;
            int kaaret = 0;
            int p = -1;
            String solmu1= "0";
            String solmu2= "0";
            while(solmut <= 0 || solmut > 100000){
                System.out.println("Anna verkon solmumäärä (0-100000 kpl)");
                solmut = sc.nextInt();
            }
            while(kaaret < solmut || kaaret > 250000){
                System.out.println("Anna verkon solmumäärä (0-250000 kpl) | kaaret > solmut");
                kaaret = sc.nextInt();
            }
            while(p < 0 || p > 100){
                System.out.println("yksittäisen kaaren vian todennäköisyys 0-100");
                p = sc.nextInt();
            }
            
            SyoteGen syotteet = new SyoteGen(solmut,kaaret,p); 
            Verkko verkko = new Verkko();
            verkko.lataaSyote(syotteet.kaariLista);
            verkko.rakennaVerkko();
            Syvyyshaku syvyysAlgo = new Syvyyshaku(verkko);
            Dijkstra dijkstra = new Dijkstra(verkko);
            solmu1 = String.valueOf(rand.nextInt(solmut));
            solmu2 = String.valueOf(rand.nextInt(solmut));
            dijkstra.laskeEtaisyysSolmuille(solmu1, solmu2);
            dijkstra.tulostaEtaisyys(solmu1,solmu2);  
        }
    }
}