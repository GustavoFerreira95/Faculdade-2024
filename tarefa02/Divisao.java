package tarefa02;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Digite o dividendo: ");
        int numero1 = num1.nextInt();
        
        Scanner num2 = new Scanner(System.in);
        System.out.print("Digite o divisor: ");
        int numero2 = num2.nextInt();
        
        float result = (float) numero1 / numero2;
        System.out.println("O valor da divisão é de: " + result);
        num1.close();
        num2.close();
    }
}
