package tarefa01Jc;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        System.out.println("A área do retângulo é: " + (base * altura));
        scanner.close();
    }
}