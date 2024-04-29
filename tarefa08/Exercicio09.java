package tarefa08;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º valor: ");
            int valor = scanner.nextInt();
            soma += valor;
        }

        double media = soma / 10.0;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }
}