package tarefa12;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é primo: ");
        int num = scanner.nextInt();
        System.out.println(ePrimo(num) ? "O número é primo." : "O número não é primo.");
        scanner.close();
    }

    public static boolean ePrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}