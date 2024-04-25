package tarefa13jc;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite um número:");
	        int numero = scanner.nextInt();
	        System.out.println(numPrimo(numero) ? "O número é primo" : "O número não é primo");
	        scanner.close();
	    }

	    public static boolean numPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i < numero; i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}