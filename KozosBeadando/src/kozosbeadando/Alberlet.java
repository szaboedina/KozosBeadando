/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kozosbeadando;

/**
 *
 * @author Asus
 */
public class Alberlet extends Lakas implements Berelheto{
    
    protected int honapSzam;

    public Alberlet(int terulet, int szobaSzam, int nmAr) {
        super(terulet, szobaSzam, 0, nmAr);
        this.honapSzam = 0;
    }

    @Override
    public int mennyibeKerul(int honapokSzama) {
        int seged;
        if (lakok>0) 
            seged=osszesKoltseg()/lakok;
        else
            seged=-1;
        return seged;
    }

    @Override
    public boolean lefoglaltE() {
        return honapSzam>0;
    }

    @Override
    public boolean lefoglal(int honapokSzama) {
        boolean sikeres=false;
        if (honapSzam==0){
            honapSzam=honapokSzama;
            sikeres=true;
        }
        return sikeres;
    }

    @Override
    public boolean bekoltozik(int emberek) {
        boolean bekoltoznek=false;
        if ((lakok+emberek/8)<=szobaSzam && (terulet/(lakok+emberek))>=2) {
            bekoltoznek=true;
        }
        if (bekoltoznek) {
            lakok+=emberek;
        }
        return bekoltoznek;
    }

    @Override
    public String toString() {
        return "Alberlet: "+super.toString() + "honapSzam=" + honapSzam;
    }
    
    
    
    
}
