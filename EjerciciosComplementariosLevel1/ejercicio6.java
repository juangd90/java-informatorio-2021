import java.util.Scanner;

public class ejercicio6{
    public static void main(String[] args) {
        int num1,num2;
       System.out.println("Ingrese el  valor: ");
       Scanner sc=new Scanner(System.in);
       num1=sc.nextInt();
       
       System.out.println("Ingrese la potencia a elevar: ");
       Scanner sc2=new Scanner(System.in);
       num2=sc2.nextInt();
       
       System.out.println(num1+" elevado a "+num2+" es "+potencia(num1,num2));
        sc.close();
        sc2.close();
    }
    public static int potencia (int numero1, int numero2) {
        int pot=1;
       for(int i=0;i<numero2;i++){
        pot=pot*numero1;
       }
       return pot;
      }
    } 

