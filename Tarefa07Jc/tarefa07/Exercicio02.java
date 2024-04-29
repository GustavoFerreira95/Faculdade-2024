package tarefa07;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int maior = Math.max(num1, Math.max(num2, num3));

        System.out.println("O maior número é: " + maior);
        scanner.close();
    }
}