package tarefa02;

import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero1 = num1.nextInt();
        
        Scanner num2 = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero2 = num2.nextInt();
        
        int result = numero1 - numero2;
        System.out.println("O valor da subtração é de: " + result);
        num1.close();
        num2.close();
    }
}