package kozosbeadando;

public class Garazs implements Berelheto, Ingatlan{
    private int terulet;
    private int nmAr;
    private boolean futottE;
    private int honapSzam;
    private boolean auto;

    public Garazs(int terulet, int nmAr, boolean futottE) {
        this.terulet = terulet;
        this.nmAr = nmAr;
        this.futottE = futottE;
        this.honapSzam = 0;
        this.auto = false;
    }

    @Override
    public int osszesKoltseg() {
        return terulet*nmAr;
    }

    @Override
    public int mennyibeKerul(int honapokSzama) {
        int ar=honapokSzama*osszesKoltseg();
        if (futottE) 
            ar=(int)(ar*1.5);
        return ar;
    }

    @Override
    public boolean lefoglaltE() {
        return honapSzam>0 || auto;
        
    }

    @Override
    public boolean lefoglal(int honapokSzama) {
        boolean foglal=false;
        if (!lefoglaltE()) {
            honapSzam+=honapokSzama;
            foglal=true;
        }
        return foglal;
    }
    public void autoKiBeAll(){
        auto=!auto;
    }

    @Override
    public String toString() {
        return "Garazs: " + "terulet=" + terulet + ", nmAr=" + nmAr + ", futottE=" + futottE + ", honapSzam=" + honapSzam + ", auto=" + auto;
    }
    
    
    
    
}
