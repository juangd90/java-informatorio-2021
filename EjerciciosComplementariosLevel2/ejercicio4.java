import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> estudiantes= new ArrayList<String>();
       
      estudiantes.add("Juan Perez");
      estudiantes.add("Juan Garcia");
      estudiantes.add("Pablo Perez");
      estudiantes.add("Daniel Perez");
      estudiantes.add("Pedro Garcia");
      estudiantes.add("Pedro Gomez");
      estudiantes.add("Raul Lopez");
      estudiantes.add("Jose Ramirez");
      estudiantes.add("Pedro Ramirez");
      estudiantes.add("Ana Garcia");
      estudiantes.add("Daniela Garcia");
      estudiantes.add("Lucia Garcia");
      
    System.out.println("Estudiantes del primer curso "+estudiantes.subList(0, 4));
    System.out.println("Estudiantes del segundo curso "+estudiantes.subList(4, 8));
    System.out.println("Estudiantes del tercer curso "+estudiantes.subList(8, 12));
   
      
     
    }
}
