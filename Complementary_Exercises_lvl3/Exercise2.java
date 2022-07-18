package Complementary_Exercises_lvl3;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
    List<Integer> palabras = List.of(1, 2, 3, 4, 5);   
    Integer potencia = 2;    
    palabras.stream().map(x -> calcularPotencia(x, potencia)).collect(Collectors.toList()).forEach(System.out::println);
    }
    public static Integer calcularPotencia(Integer numero, Integer potencia){if (potencia == 0){return 1;}else {return numero * calcularPotencia(numero, potencia-1);}        }
}

