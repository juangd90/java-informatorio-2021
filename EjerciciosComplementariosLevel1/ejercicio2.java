import java.util.Scanner;

public class ejercicio2{
    public static void main(String[] args) {
        int num1,num2,suma,resta,mult,divi,modulo;
        System.out.println("Ingrese el primer número: "); 
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        System.out.println("Ingrese el segundo número: "); 
        Scanner sc2=new Scanner(System.in);
        num2=sc.nextInt();
        sc.close();sc2.close();
        suma=num1+num2;
        resta=num1-num2;
        mult=num1*num2;
        divi=num1/num2;
        modulo=num1%num2;
        System.out.println(num1+"+"+num2+"="+suma);
        System.out.println(num1+"-"+num2+"="+resta);
        System.out.println(num1+"x"+num2+"="+mult);
        System.out.println(num1+"/"+num2+"="+divi);
        System.out.println(num1+"%"+num2+"="+modulo);
        
      
    } 
}

    


