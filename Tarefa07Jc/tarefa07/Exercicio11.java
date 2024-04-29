package tarefa07;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de morangos (em Kg): ");
        double morangosKg = scanner.nextDouble();

        System.out.println("Digite a quantidade de maçãs (em Kg): ");
        double macasKg = scanner.nextDouble();

        double valorTotal = calcularValor(morangosKg, macasKg);
        String format = "%.2f%n";
        System.out.printf("Valor a ser pago pelo cliente: R$: ");
        System.out.printf(format, valorTotal);
        scanner.close();
    }

    public static double calcularValor(double morangosKg, double macasKg) {
        double precoMorango = morangosKg <= 5 ? 2.50 : 2.20;
        double precoMaca = macasKg <= 5 ? 1.80 : 1.50;

        double valorTotal = (precoMorango * morangosKg) + (precoMaca * macasKg);

        if (valorTotal > 25 || (morangosKg + macasKg) > 8) {
            valorTotal *= 0.90;
        }

        return valorTotal;
    }
}