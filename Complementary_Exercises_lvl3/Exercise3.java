package Complementary_Exercises_lvl3;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        System.out.println(palabras.stream().filter(p -> p.startsWith("B") || p.startsWith("b")).count());
    }
}