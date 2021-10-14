import java.util.*;

import java.util.Collections;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Set<String> empleados = new HashSet<String>();
        HashMap<String,Integer> sueldos= new HashMap<String,Integer>();
        empleados.add("juan");
        empleados.add("12345678");
        empleados.add("8");
        empleados.add("200");
        String [] empleadoS=empleados.toArray(new String[empleados.size()]);
        int precio=(Integer.parseInt(empleadoS[0]));
        int horas=(Integer.parseInt(empleadoS[1]));
        int sueldo= precio*horas;
        sueldos.put(empleadoS[2], sueldo);

        System.out.println(sueldos);


       
      
     
    }
}
