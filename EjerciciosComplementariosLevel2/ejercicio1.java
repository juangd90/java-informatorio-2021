import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> ciudades=new ArrayList<String>();
        ciudades.add("Bariloche");
        ciudades.add("Cordoba");
        ciudades.add("Resistencia");
        //System.out.println(ciudades);
        for(int i=0;i<ciudades.size();i++){
            System.out.println(ciudades.get(i));
        }        
    }
}
