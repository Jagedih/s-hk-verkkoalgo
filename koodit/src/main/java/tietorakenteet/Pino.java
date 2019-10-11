package tietorakenteet;

public class Pino<T> {
    /**Perinteinen pino**/
    private Object[] pino;
    private int tyhja, koko;
    public Pino(){
       this.pino = new Object[25];
    }
    public void puske(T alkio){
        /**Lisää alion päällimmäiseksi pinoon**/
        if(tyhja == this.pino.length /2){
            lisaaKokoa();
        }
        this.pino[tyhja] = alkio;
        tyhja++;
        koko++;
    }
    public T poistaYlin(){
        /**Poistaa päällimmäisen alkion pinosta**/
        if(this.tyhja != 0){
            T ylin = (T) this.pino[tyhja-1];
            this.koko--;
            this.tyhja--;
            this.pino[tyhja] = null;
            return ylin;
        }
        return null;
    }
    public int getKoko(){
        return this.koko;
    }
    private void lisaaKokoa(){
        /**Lisää pinon kokoa, kun se on puoleksi täynnä kopioimalla vanhan listan
         uuteen isompaan listaan**/
    
        Object[] uusiPino = new Object[this.pino.length*2];
        System.arraycopy(this.pino, 0, uusiPino, 0, tyhja);
        this.pino = uusiPino;
    }
    
    
}
