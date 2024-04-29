package tarefa09;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Digite um valor positivo ou um valor negativo para encerrar: ");
            int valor = scanner.nextInt();

            if (valor < 0) {
                break;
            }

            if (valor > maiorValor) {
                maiorValor = valor;
            }

            if (valor < menorValor) {
                menorValor = valor;
            }
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);

        scanner.close();
    }
}