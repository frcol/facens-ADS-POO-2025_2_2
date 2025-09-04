package Aula_2;

import java.util.Scanner;

public class Main_Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Numero 1");
        int num1 = scan.nextInt();
        
        System.out.println("Numero 2");
        int num2 = scan.nextInt();
        
        int resultado = soma(num1, num2);
        System.out.println("Resultado = "+resultado);
    }
    
    public static int soma(int x, int y) {
        int soma = x+y;
        
        return soma;
    }
}
