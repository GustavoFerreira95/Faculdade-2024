package tarefa01Jc;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        if (num2 != 0) {
            System.out.println("A divisão de " + num1 + " por " + num2 + " é: " + (num1 / num2));
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
        scanner.close();
    }
}