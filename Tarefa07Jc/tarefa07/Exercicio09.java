package tarefa07;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de litros vendidos: ");
        double litros = scanner.nextDouble();
        System.out.println("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0);

        double precoGasolina = 3.30;
        double precoAlcool = 2.90;
        double valorAPagar = 0;
        String format = "%.2f%n";

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            if (litros <= 20) {
                valorAPagar = litros * (precoAlcool * 0.97);
            } else {
                valorAPagar = litros * (precoAlcool * 0.95);
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litros <= 20) {
                valorAPagar = litros * (precoGasolina * 0.96);
            } else {
                valorAPagar = litros * (precoGasolina * 0.94);
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
        }

        if (valorAPagar > 0) {
            System.out.printf("O valor a ser pago é: R$: ");
            System.out.printf(format, valorAPagar);
        }

        scanner.close();
    }
}