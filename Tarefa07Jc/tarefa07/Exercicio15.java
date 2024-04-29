package tarefa07;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do empregado: ");
        int codigoEmpregado = scanner.nextInt();

        System.out.println("Digite o ano de nascimento do empregado: ");
        int anoNascimento = scanner.nextInt();

        System.out.println("Digite o ano de ingresso do empregado na empresa: ");
        int anoIngresso = scanner.nextInt();

        int idade = 2024 - anoNascimento;
        int tempoTrabalho = 2024 - anoIngresso;

        System.out.println("Idade do empregado: " + idade);
        System.out.println("Tempo de trabalho do empregado: " + tempoTrabalho);

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }

        scanner.close();
    }
}