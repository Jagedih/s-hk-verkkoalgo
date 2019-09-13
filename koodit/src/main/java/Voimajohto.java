public class Voimajohto {
    private final Sahkoasema vastaSahkoasema1;
    private final Sahkoasema vastaSahkoasema2;
    private boolean katkaisijatKiinni;
    
    public Voimajohto(Sahkoasema vastaSahkoasema1, Sahkoasema vastaSahkoasema2, boolean katkaisijanTila){
        /**Voimajohto on verkon kaari, jonka paissa on solmuna toimivat sahkoasemat tiedot saadaan syötedatasta**/
        this.vastaSahkoasema1 = vastaSahkoasema1;
        this.vastaSahkoasema2 = vastaSahkoasema2;
        this.katkaisijatKiinni = katkaisijanTila;
    }
    public boolean onkoKatkaisijatKiinni(){
        /***palauttaa arvon true jos voimajohdossa kulkee sähkö kahden sahkoaseman välilla tilatieto saadaan työtedatasta***/
        return this.katkaisijatKiinni;
    }
    public void suljeaKatkaisijat(){
        /***Kytkee jännitteellisen yhteyden kahden sähköaseman välille***/
        this.katkaisijatKiinni = true;
    }
}
