package Complementary_Exercises_lvl1;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("ingrese el primer numero: ");
        num1 = leer.nextInt();

        System.out.println("ingrese el segundo numero: ");
        num2 = leer.nextInt();
        leer.close();
        
        int sum = 0; 
        int i = 1;

        for (i=1; i<=num2; i++) {
            sum = sum+num1;    
        }
        System.out.println(sum);
    
    }
}