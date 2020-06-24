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
public class CsaladiApartman extends Lakas{
    private int gyerekekSzama;

    public CsaladiApartman(int terulet, int szobaSzam, int nmAr) {
        super(terulet, szobaSzam, 0, nmAr);
        this.gyerekekSzama = 0;
    }
    public boolean gyerekSzuletik(){
        boolean szuletik=false;
        if (lakok-gyerekekSzama>=2) {
            lakok++;
            gyerekekSzama++;
            szuletik=true;
        }
        return szuletik;
    }

    @Override
    public boolean bekoltozik(int emberek) {
        boolean bekoltozhetnek=false;
        if (terulet/(lakok-gyerekekSzama/2)>=10 && lakok/szobaSzam<=2) {
            bekoltozhetnek=true;
            lakok+=emberek;
        }
        return bekoltozhetnek;
    }

    @Override
    public String toString() {
        return "CsaladiApartman: "+super.toString() + "gyerekekSzama=" + gyerekekSzama + '}';
    }
    
}
