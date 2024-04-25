package tarefa13jc;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        System.out.println(ePar(numero) ? "O número é par" : "O número é ímpar");
        scanner.close();
    }

    public static boolean ePar(int numero) {
        return numero % 2 == 0;
    }
}
