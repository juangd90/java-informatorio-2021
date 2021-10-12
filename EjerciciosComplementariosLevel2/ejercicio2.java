import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros= new ArrayList<Integer>();
        numeros.add(5) ;   
        numeros.add(2) ;  
        numeros.add(1) ;  
        numeros.add(4) ;  
        numeros.add(3) ;
        System.out.println("Lista original");
        for(int i=0;i<numeros.size();i++){
            System.out.print(numeros.get(i)+"-");
        }
        //agrego al principio
        numeros.add(0, 10);
        System.out.println("");
        System.out.println("Lista con número al principio");
        for(int i=0;i<numeros.size();i++){
            System.out.print(numeros.get(i)+"-");
        }
        System.out.println("");
        numeros.add(6, 11);
        System.out.println("");
        System.out.println("Lista con número al final");
        for(int i=0;i<numeros.size();i++){
            System.out.print(numeros.get(i)+"-");
        }
    }
}
