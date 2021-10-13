import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> horas= new ArrayList<Integer>();
        ArrayList<Integer> valor= new ArrayList<Integer>();
        int suma=0;
        horas.add(6);
        horas.add(7);
        horas.add(8);
        horas.add(4);
        horas.add(5);

        valor.add(350);
        valor.add(345);
        valor.add(550);
        valor.add(600);
        valor.add(320);
       
        for(int i=0;i<horas.size();i++){
            System.out.print(" $"+(horas.get(i)*valor.get(i)));
            suma=suma+horas.get(i)*valor.get(i);
        }
        System.out.println("");
        System.out.println("Valor final: $"+suma);
      
     
    }
}
