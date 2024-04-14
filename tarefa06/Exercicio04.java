package tarefa06;

import java.util.Scanner;

public class Exercicio04 {

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
		int media = somaMedia / 4;

		if (media >= 7) {
			System.out.println("Parabéns você foi aprovado: " + media);
		} else if (media < 7) {
			System.out.print("Digite a nota do exame: ");
			double notaExame = scanner.nextDouble();

			double notaFinal = (notaExame + media) / 2;

			if (notaExame >= 5) {
				System.out.println("Aluno aprovado em exame com média: " + notaFinal);
			} else {
				System.out.println("Você foi reprovado na nova média: " + notaFinal);
			}
		}
		scanner.close();
	}
}
