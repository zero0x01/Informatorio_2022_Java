package Complementary_Exercises_lvl2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        List<String> Alumnos = new ArrayList<String>(Arrays.asList("andres", "roberto", "carlos", "johana", "simon", "juana", "maria", "pedro", "rogelio", "mirtha", "david", "sebastian"));
        
        List<String> curso1 = Alumnos.subList(0, 4);
        List<String> curso2 = Alumnos.subList(4, 8);
        List<String> curso3 = Alumnos.subList(8, 12);

        System.out.println("curso 1: " + curso1);
        System.out.println("curso 2: " + curso2);
        System.out.println("curso 3: " + curso3);    
    }
}