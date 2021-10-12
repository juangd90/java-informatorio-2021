import java.util.Scanner;

public class ejercicio7{
    public static void main(String[] args) {
      String pal;
      System.out.println("Ingrese la palabra a poner en mayusculas");
      Scanner sc=new Scanner(System.in);
      pal=sc.nextLine();
      sc.close();
      System.out.println(mayus(pal));
    }
    public static String mayus (String palabra) {
       String mayus="";
       int suma;
       
       for(int i=0;i<palabra.length();i++){
           int letra=(int)palabra.charAt(i);
          char let=((char)(letra+32));
           System.out.println(let);
       }
       return mayus.toString();
      }
    } 