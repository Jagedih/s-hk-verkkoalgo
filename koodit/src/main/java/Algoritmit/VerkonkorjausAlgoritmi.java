package Algoritmit;
import Verkkokomponentit.Verkko;
import java.util.HashSet;
import java.util.Stack;

public class VerkonkorjausAlgoritmi {
    boolean[] korjatutSaarekkeet;
    int isoimmanSaarekkeenIndeksi;
    HashSet<String>[] saarekkeet;
    Verkko sahkoverkko;
    
    public VerkonkorjausAlgoritmi(Stack<HashSet> saarekkeet, Verkko verkko){
        this.sahkoverkko = verkko;
        this.korjatutSaarekkeet = new boolean[saarekkeet.size()];
        this.saarekkeet = new HashSet[this.saarekkeet.length];
        for(int i =0; i< this.saarekkeet.length; i++){
            this.saarekkeet[i] = saarekkeet.pop();
        }
    }
    public void maaritaIsoinAliverkko(){
        this.isoimmanSaarekkeenIndeksi = saarekkeet[0].size();
        for(int i= 1; i < korjatutSaarekkeet.length; i++){
            if(this.saarekkeet[i].size() > this.isoimmanSaarekkeenIndeksi){
                this.isoimmanSaarekkeenIndeksi = this.saarekkeet[i].size();
            }
        }
    }
    public void korjaaVerkko(){
        int korjaustenMaara = 0;
        int i = 0;
        while(korjaustenMaara < this.korjatutSaarekkeet.length){
            if(i == this.isoimmanSaarekkeenIndeksi){
                continue;
            }
       }
    }
}
