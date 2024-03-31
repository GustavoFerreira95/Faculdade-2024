//1) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!

package tarefa05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um valor inteiro: ");
        
		int numeroMaior = scanner.nextInt();
		
        if (numeroMaior > 10) {
			  System.out.println("é maior que 10");
			} else {
				System.out.println("é menor que 10");
			}
        scanner.close();
	}

}
