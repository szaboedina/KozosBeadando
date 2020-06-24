
package kozosbeadando;


public abstract class Lakas implements Ingatlan{
    protected int terulet;
    protected int szobaSzam;
    protected int lakok;
    protected int nmAr;

    public Lakas(int terulet, int szobaSzam, int lakok, int nmAr) {
        this.terulet = terulet;
        this.szobaSzam = szobaSzam;
        this.lakok = lakok;
        this.nmAr = nmAr;
    }
 
    public abstract boolean bekoltozik(int emberek);

    @Override
    public int osszesKoltseg() {
        return terulet*nmAr;
    }
    
    public int lakokSzama(){
        return lakok;
    }

    @Override
    public String toString() {
        return "terület=" + terulet + ", szobák száma:" + szobaSzam + ", lakók:" + lakok + ", Négyzetméter ár:" + nmAr + '}';
    }
    
}
