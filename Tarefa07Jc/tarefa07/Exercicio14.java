package tarefa07;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double N1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double N2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double N3 = scanner.nextDouble();

        System.out.println("Digite a média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        double mediaAproveitamento = (N1 + N2 * 2 + N3 * 3 + mediaExercicios) / 7;

        char conceito;
        if (mediaAproveitamento >= 9.0) {
            conceito = 'A';
        } else if (mediaAproveitamento >= 7.5) {
            conceito = 'B';
        } else if (mediaAproveitamento >= 6.0) {
            conceito = 'C';
        } else {
            conceito = 'D';
        }

        System.out.printf("Média de Aproveitamento: %.2f\n", mediaAproveitamento);
        System.out.println("Conceito: " + conceito);

        scanner.close();
    }
}