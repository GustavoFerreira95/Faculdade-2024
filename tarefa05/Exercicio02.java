//2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

package tarefa05;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um valor inteiro: ");
        
		int numeroInteiro = scanner.nextInt();
		
        if (numeroInteiro > 0) {
			  System.out.println("é positivo");
			} else {
				System.out.println("é negativo");
			}
        scanner.close();
	}

}
