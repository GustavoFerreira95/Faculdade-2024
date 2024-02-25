package tarefa02;

import java.util.Scanner;

public class Losango {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Digite o valor da primeira diagonal: ");
        int numero1 = num1.nextInt();
        
        Scanner num2 = new Scanner(System.in);
        System.out.print("Digite o valor da segunda diagonal: ");
        int numero2 = num2.nextInt();
        
        float result = (float) numero1 * numero2 / 2;
        System.out.println("A área do losango é de: " + result);
        num1.close();
        num2.close();
    }
}
