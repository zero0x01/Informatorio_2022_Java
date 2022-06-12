package Complementary_Exercises_lvl2;
import java.util.*;
import java.util.HashMap;


public class Exercise6 {
    
    
    String nombreYApellido;
    int DNI;
    int horasTrabajadas;  
    static int valorPorHoras;
    static int Salario;
    static Map<Integer, Integer> DNISalario = new HashMap<>() ;
    
    
    Exercise6(String nombreYApellido, int DNI, int horastrabajadas, int valorPorHoras){
        this.nombreYApellido = nombreYApellido;
        this.DNI = DNI;  
        this.horasTrabajadas = horastrabajadas;
        Exercise6.valorPorHoras = valorPorHoras;
    }
    public static void main(String[] args) {
        
        Exercise6 personal1 = new Exercise6("Ginés García", 43345543, 30, 23000);
        Exercise6 personal2 = new Exercise6("Carla Vizzotti", 45098890, 20, 15000);
        Exercise6 personal3 = new Exercise6("Santiago Cafiero", 38093345, 28, 20000 );
        Exercise6 personal4 = new Exercise6("Victoria Donda", 36342213, 20, 16000 );
        


        HashSet<Exercise6> personal = new HashSet<Exercise6>();
        personal.add(personal1);
        personal.add(personal2);
        personal.add(personal3);
        personal.add(personal4);
        
        for(Exercise6 i : personal){ 
        Integer DNI = i.DNI;
        Integer Salario = i.horasTrabajadas*valorPorHoras;
        DNISalario.put(DNI, Salario);
        }
    System.out.println(DNISalario);
        
    }  

}