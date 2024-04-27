package tarefa01Jc;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        System.out.println("A área do quadrado é: " + (lado * lado));
        scanner.close();
    }
}