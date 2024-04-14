package tarefa06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a Primeira nota: ");
		int nota1 = scanner.nextInt();

		System.out.print("Digite a Segunda nota: ");
		int nota2 = scanner.nextInt();
		
		System.out.print("Digite a Terceira nota: ");
		int nota3 = scanner.nextInt();

		System.out.print("Digite a quarta nota: ");
		int nota4 = scanner.nextInt();
		
		int somaMedia = nota1 + nota2 + nota3 + nota4;
		int media = somaMedia/4;

		if (media >= 5) {
			System.out.println("Parabéns você foi aprovado: " + media);
		} else {
			System.out.println("Infelizmente terá que repetir de ano: " + media);
		}
		scanner.close();
	}
}
