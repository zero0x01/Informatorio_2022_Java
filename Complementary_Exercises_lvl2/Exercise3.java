package Complementary_Exercises_lvl2;
import java.util.ArrayList;
import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        
        List<String> listaCartas = new ArrayList<String>(Arrays.asList("A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"));
        
        List<String> listaCartasInvertidas = new ArrayList<>(listaCartas);
        Collections.reverse(listaCartasInvertidas);
        
        List<String> listaCartasDesordenadas = new ArrayList<>(listaCartas);
        Collections.shuffle(listaCartasDesordenadas);

        System.out.print("\nCartas en orden: \t\t");
        for(int i=0; i< listaCartas.size(); i++){
           System.out.print(listaCartas.get(i) + " ");
        }
        System.out.print("\nCartas en orden inverso: \t");
        for(int i=0; i< listaCartas.size(); i++){
            System.out.print(listaCartasInvertidas.get(i) + " ");
        }
        System.out.print("\ncartas desordenadas: \t\t");
        for(int i=0; i< listaCartas.size(); i++){
            System.out.print(listaCartasDesordenadas.get(i) + " ");
        }
    }    
}