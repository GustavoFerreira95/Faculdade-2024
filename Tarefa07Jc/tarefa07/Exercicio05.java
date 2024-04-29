package tarefa07;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as medidas dos lados de um triângulo: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("As medidas formam um triângulo.");
        } else {
            System.out.println("As medidas não formam um triângulo.");
        }
        scanner.close();
    }
}