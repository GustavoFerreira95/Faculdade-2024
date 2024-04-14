package tarefa06;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite um valor inteiro:");
	        int valor = scanner.nextInt();

	        if (valor <= 3 && valor >= 0) {
	            System.out.println("O valor é: " + valor);
	        } else { 
	        	System.out.println("O valor digitado é maior que 3 ou menor que 0");
	        }

	        scanner.close();
	    }

}
