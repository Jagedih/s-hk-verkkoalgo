package tietorakenteet;

/**
 *
 * @author Jagedih
 * @param <T>
 */
public class Pino<T> {
    private Object[] pino;
    private int tyhja, koko;

    /**
     * Itsetoteutettu Pino
     */
    public Pino(){
       this.pino = new Object[25];
    }
    /**
     * Lisää alion päällimmäiseksi pinoon
     * @param alkio lisättä alkio pinoon
     */
    public void puske(T alkio){
        if(tyhja == this.pino.length /2){
            lisaaKokoa();
        }
        this.pino[tyhja] = alkio;
        tyhja++;
        koko++;
    }

    /**
     *
     * @return palauttaa ja poistaa ylimman alkion pinosta
     */
    public T poistaYlin(){
        if(this.tyhja != 0){
            T ylin = (T) this.pino[tyhja-1];
            this.koko--;
            this.tyhja--;
            this.pino[tyhja] = null;
            return ylin;
        }
        return null;
    }

    /**
     *
     * @return palauttaa pinon koon
     */
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

    /**
     *
     * @return palauttaa arvon true jos pino on tyhjä
     */
    public boolean onkoTyhja(){
        return this.tyhja == 0;
    }
}
