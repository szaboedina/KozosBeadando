package kozosbeadando;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hazmester {
    
    
    
    public static void Karbantart(String eleresiUt){
        
        
        try {
            File hazak=new File(eleresiUt);
            Scanner sc=new Scanner(hazak);
            while (sc.hasNextLine()) {                
                String[] s=sc.nextLine().split(" ");
                switch (s[0]){
                    case "Alberlet":
                        Alberlet a=new Alberlet(Integer.parseInt(s[1]),Integer.parseInt(s[2]), Integer.parseInt(s[3]));
                        
                    break;
                        case "CsaladiApartman":
                            CsaladiApartman cs=new CsaladiApartman(Integer.parseInt(s[1]),Integer.parseInt(s[2]), Integer.parseInt(s[3]));
                            break;
                    case "Garazs":
                                Garazs g=new Garazs(Integer.parseInt(s[1]), Integer.parseInt(s[2]), s[3].equals("futott"));
                            break;
                }
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Írási/olvasási hiba");
        }
        
    }
    
    
    
    public static void main(String[] args) {
        
        Karbantart("hazak.txt");
        
        
        
        
        
        
    }
    
}
