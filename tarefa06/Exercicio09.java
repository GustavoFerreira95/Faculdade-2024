package tarefa06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Digite um valor para verificar se é impar ou par:");
	        int valorNum = scanner.nextInt();
	        
	        if (valorNum % 2 == 0) {
	            System.out.println("O numero digitado é par");
	        } else { 
	        	System.out.println("O numero digitado é impar");
	        }
	        scanner.close();
	}

}
