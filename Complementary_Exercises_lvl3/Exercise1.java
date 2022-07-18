package Complementary_Exercises_lvl3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        List<String> palabrasConFiltro = palabras.stream().filter(Objects::nonNull).filter(x -> !x.equals("")).collect(Collectors.toList());
        System.out.println(palabrasConFiltro);
    }
}