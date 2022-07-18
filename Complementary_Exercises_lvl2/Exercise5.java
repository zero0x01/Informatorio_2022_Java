package Complementary_Exercises_lvl2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
      List<Integer> horas_trabajadas = new ArrayList<>(Arrays.asList(6, 7, 8, 4, 5));
      List<Integer> valor_por_hora = new ArrayList<>(Arrays.asList(350, 345, 550, 600, 320));

      List<Integer> total_por_dia = new ArrayList<>();
    
      int total_por_semana = 0;
      for(int i = 0; i<5; i++){
          total_por_dia.add(i, (horas_trabajadas.get(i) * valor_por_hora.get(i)));
          total_por_semana += total_por_dia.get(i);
      }
        System.out.println(total_por_dia);
        
        System.out.println("Total final:  $" + total_por_semana);   
    }    
}