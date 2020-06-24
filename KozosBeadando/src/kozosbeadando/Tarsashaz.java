package kozosbeadando;

import java.util.ArrayList;
import java.util.List;


public class Tarsashaz {
    private  List<Ingatlan> tarsashazList;
    private int maxLakasSzam;
    private int maxGarazsSzam;
    private int lakasokSzama;
    private int garazsokSzama;

    public Tarsashaz(int maxLakasSzam, int maxGarazsSzam) {
        this.tarsashazList =new ArrayList<>();
        this.maxLakasSzam = maxLakasSzam;
        this.maxGarazsSzam = maxGarazsSzam;
        this.lakasokSzama=0;
        this.garazsokSzama=0;
    }
    
    public boolean lakasHozzaad(Lakas l){
        boolean sikerult=false;
        if (maxLakasSzam>lakasokSzama) {
            tarsashazList.add(l);
            lakasokSzama++;
            sikerult=true;
        }
        return sikerult;
    }
    public boolean garazsHozzaad(Garazs g){
        boolean sikerult=false;
        if (maxGarazsSzam>garazsokSzama) {
            tarsashazList.add(g);
            garazsokSzama++;
            sikerult=true;
        }
        return sikerult;
    }
    
    public int osszesLako(){
        int lakokSzama=0;
        for (Ingatlan l : tarsashazList){
            if (l instanceof Lakas) {
                Lakas ing=(Lakas)l;
                lakokSzama+=ing.lakok;
            }
        }
        return lakokSzama;
    }
    
    public int ingatlanErtek(){
        int ertek=0;
        for (Ingatlan i : tarsashazList){
            if (i instanceof Lakas) {
                Lakas l=(Lakas)i;
                if (l.lakok>0) {
                    ertek+=l.osszesKoltseg();
                }
            }
            else{
                Garazs g=(Garazs)i;
                if (g.lefoglaltE()) {
                    ertek+=g.osszesKoltseg();
                }
            }
        }
        return ertek;
    }
    
}
