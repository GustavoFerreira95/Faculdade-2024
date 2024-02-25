package tarefa02;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Digite a base do retângulo: ");
        int numero1 = num1.nextInt();
        
        Scanner num2 = new Scanner(System.in);
        System.out.print("Digite a altura do retângulo: ");
        int numero2 = num2.nextInt();
        
        float result = (float) numero1 * numero2;
        System.out.println("A área do retângulo é de: " + result);
        num1.close();
        num2.close();
    }
}
