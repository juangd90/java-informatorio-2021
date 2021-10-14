import java.util.*;

import java.util.Collections;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {    
    
      Fizz(1,8);
     
    }
    static void Fizz(int a, int b){
        int restoa,restob;
        if(a>b){
            System.out.println("Error");
        }
         else{
            for(int i=a;i<b;i++){
                restoa=i%2;
                
                restob=i%3;
                
                if(restoa==0){
                    System.out.print("Fizz, ");
                } else if (restob==0){
                    System.out.print("Buzz, ");
                } else if(restoa==0 && restob==0){
                    System.out.print("Entra, ");
                }
                 else {
                    System.out.print(i+", ");
                }
            }
        }
    }
}

