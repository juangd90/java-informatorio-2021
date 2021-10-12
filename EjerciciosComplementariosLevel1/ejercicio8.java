import java.util.Scanner;

public class ejercicio8{
    public static void main(String[] args) {
      String nombre,edad,direccion,ciudad;
      System.out.println("Ingrese nombre y apellido");
      Scanner sc=new Scanner(System.in);
      nombre=sc.nextLine();
      System.out.println("Ingrese su edad");
      Scanner sc2=new Scanner(System.in);
      edad=sc2.nextLine();
      System.out.println("Ingrese su dirección");
      Scanner sc4=new Scanner(System.in);
      direccion=sc4.nextLine();
      System.out.println("Ingrese su ciudad");
      Scanner sc3=new Scanner(System.in);
      ciudad=sc3.nextLine();
     
      System.out.println(imprimir(nombre, edad, direccion, ciudad));
    
    }
    public static String imprimir (String nombre,String edad,String dire,String ciu){
       
       return ciu+" "+" "+dire+" "+edad+" "+nombre;
     
    } 
}