package tarefa13jc;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite o primeiro número:");
	        int num1 = scanner.nextInt();
	        System.out.println("Digite o segundo número:");
	        int num2 = scanner.nextInt();
	        System.out.println("O maior número é " + Math.max(num1, num2));
	        scanner.close();
	    }
	}