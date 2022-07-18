package Complementary_Exercises_lvl2;

import java.util.Scanner;

public class Exercise7{ 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa dos numeros, el primero menor al segundo. \n1° numero: ");
        int num1 = input.nextInt();
        System.out.print("2° numero: ");
        int num2 = input.nextInt();
        input.close();
        System.out.println();
        System.out.println("Resultado: ");


        ArrayString2argumentos(num1, num2);
    }
    public static void ArrayString2argumentos(Integer num1, Integer num2){
       
        String [] resultado = new String[(num2-num1)];
        
        int contador = 0;
        for(int i = num1; i< num2; i ++){                        
                if(i%3 == 0 && i%2==0){
                    resultado[contador] = "FizzBuzz";   
                }
                else if(i%2 == 0){
                    resultado[contador] = "Fizz";                
                }
                else if(i%3 == 0){
                    resultado[contador] = "Buzz"; 
                }
                else{
                    resultado[contador] = (String.valueOf(i));
                }
                contador++;                
        }                
        for(int i =0; i<(num2-num1); i++){
            System.out.println(resultado[i]);
        }
    }
}