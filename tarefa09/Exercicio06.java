package tarefa09;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 0;
        while (true) {
            System.out.println("Digite um valor positivo ou um valor negativo para encerrar: ");
            int valor = scanner.nextInt();

            if (valor < 0) {
                break;
            }

            soma += valor;
            contador++;
        }

        if (contador > 0) {
            double media = soma / (double) contador;
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhum valor foi inserido.");
        }

        scanner.close();
    }
}