package tarefa12;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.println("Digite o peso do primeiro valor: ");
        double peso1 = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        System.out.println("Digite o peso do segundo valor: ");
        double peso2 = scanner.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();
        System.out.println("Digite o peso do terceiro valor: ");
        double peso3 = scanner.nextDouble();
        System.out.println("A média ponderada é: " + medPonderada(valor1, peso1, valor2, peso2, valor3, peso3));
        scanner.close();
    }

    public static double medPonderada(double valor1, double peso1, double valor2, double peso2, double valor3, double peso3) {
        return (valor1 * peso1 + valor2 * peso2 + valor3 * peso3) / (peso1 + peso2 + peso3);
    }
}