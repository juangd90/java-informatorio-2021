import java.util.Scanner;

public class ejercicio9{
    public static void main(String[] args) {
     String cadena="",cadena2;
     char letra;
     System.out.println("Ingrese la palabra");
     Scanner sc=new Scanner(System.in);
     cadena=sc.nextLine();
     System.out.println("Ingrese la letra a buscar");
     Scanner sc2=new Scanner(System.in);
     cadena2=sc2.nextLine();
     letra=cadena2.charAt(0);
        System.out.println(buscar(cadena, letra));
    
    }
    public static int buscar (String pal,char letra){
        int contador=0;
       for(int i=0;i<pal.length();i++){
           if(pal.charAt(i)==letra){
               contador++;
           }
       }
       return contador;
     
    } 
}