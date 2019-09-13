
import java.util.Map;
import java.util.Random;

public class SyoteG {
    /**Luokkaa käytetään syötedatan generoimiseen**/
   Map<String,Boolean> syoteKaarista;
   Random lukuGen = new Random();
   
   public void rakennaSyote(int sahkoasemienLkm){
       /**Rakentaa syötedatan, syotedata koostuu kaaren nimestä ja voimajohdon tilatiedosta
        solmulla on 1-3 kaarta toisiin verkon solmuihin**/
       int asemaNro = 1;
       while(asemaNro < sahkoasemienLkm){
           for(int i = 1; i <= lukuGen.nextInt(2)+1; i++){
           
            }
        }
   }
   public boolean arvoSahkolinjanJannite(){
       /**Arpoo johdon voimajohdon tilan, joko se siinä kulkee sähkö tai ei**/
       return lukuGen.nextInt(100) < 20;
   }
   
    
}
