package tarefa01Jc;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do triângulo: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();
        System.out.println("A área do triângulo é: " + (base * altura / 2));
        scanner.close();
    }
}