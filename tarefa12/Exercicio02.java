package tarefa12;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial: ");
        int num = scanner.nextInt();
        long result = fatorial(num);
        if (result == -1) {
            System.out.println("O número deve ser não negativo.");
        } else {
            System.out.println("O fatorial de " + num + " é " + result);
        }
        scanner.close();
    }

    public static long fatorial(int num) {
        if (num >= 0) {
            long result = 1;
            for (int i = 2; i <= num; i++) {
                result *= i;
            }
            return result;
        } else {
            return -1;
        }
    }
}