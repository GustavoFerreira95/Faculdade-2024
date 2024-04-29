package tarefa07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Números iguais");
        } else if (num1 > num2) {
            System.out.println("Primeiro é maior");
        } else {
            System.out.println("Segundo maior");
        }
        scanner.close();
    }
}