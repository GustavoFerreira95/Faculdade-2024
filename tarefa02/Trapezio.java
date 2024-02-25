package tarefa02;

import java.util.Scanner;

public class Trapezio {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Digite o valor da primeira diagonal: ");
        int numero1 = num1.nextInt();
        
        Scanner num2 = new Scanner(System.in);
        System.out.print("Digite o valor da segunda diagonal: ");
        int numero2 = num2.nextInt();
        
        Scanner num3 = new Scanner(System.in);
        System.out.print("Digite a altura: ");
        int numero3 = num3.nextInt();
        
        float result = (float) (numero1 + numero2) * numero3 / 2;
        System.out.println("A área do trapézio é de: " + result);
        num1.close();
        num2.close();
        num3.close();
    }
}
