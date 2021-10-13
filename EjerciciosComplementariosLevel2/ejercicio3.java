import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> baraja= new ArrayList<Integer>();
       for(int i=2;i<=10;i++){
           baraja.add(i);
       }
       for(int i=0;i<baraja.size();i++){
       System.out.println(baraja.get(i));
    }
    System.out.println("Reverso");
    Collections.reverse(baraja);
    for(int i=0;i<baraja.size();i++){
        System.out.println(baraja.get(i));
     }
     System.out.println("Mezclado");
     Collections.shuffle(baraja);
     for(int i=0;i<baraja.size();i++){
        System.out.println(baraja.get(i));
     }
    }
}
