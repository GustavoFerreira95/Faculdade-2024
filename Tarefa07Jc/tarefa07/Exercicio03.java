package tarefa07;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int soma = num1 + num2 + num3 - Math.min(num1, Math.min(num2, num3));

        System.out.println("A soma dos dois maiores números é: " + soma);
        scanner.close();
    }
}