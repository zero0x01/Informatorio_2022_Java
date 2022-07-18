package Complementary_Exercises_lvl1;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre para imprimir en consola un saludo con su nombre!!!");
        String nombre = input.nextLine();
        input.close();
        System.out.println("HOLA " + nombre.toUpperCase());
    }
}