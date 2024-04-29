package tarefa09;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.println("Digite o " + i + "º valor: ");
            int valor = scanner.nextInt();
            soma += fatorial(valor);
        }

        System.out.println("A soma dos fatoriais é: " + soma);

        scanner.close();
    }

    public static int fatorial(int num) {
        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}