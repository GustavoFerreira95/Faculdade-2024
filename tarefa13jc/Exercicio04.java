package tarefa13jc;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número:");
        int num3 = scanner.nextInt();
        System.out.println("A média dos números é " + calcularMedia(num1, num2, num3));
        scanner.close();
    }

    public static double calcularMedia(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}