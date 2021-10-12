import java.util.Scanner;

public class ejercicio5{
    public static void main(String[] args) {
        int num1,num2;
       System.out.println("Ingrese el primer valor: ");
       Scanner sc=new Scanner(System.in);
       num1=sc.nextInt();
       
       System.out.println("Ingrese el segundo valor: ");
       Scanner sc2=new Scanner(System.in);
       num2=sc2.nextInt();
       
       System.out.println(num1+"x"+num2+"="+multi(num1,num2));
        sc.close();
        sc2.close();
    }
    public static int multi (int numero1, int numero2) {
        int mult=0;
       for(int i=0;i<numero1;i++){
        mult=mult+numero2;
       }
       return mult;
      }
    } 


    


