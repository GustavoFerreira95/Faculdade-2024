// 7) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

package tarefa05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero1 = scanner.nextInt();

		System.out.print("Digite outro número: ");
		int numero2 = scanner.nextInt();

		if (numero1 > numero2) {
			System.out.println("Em ordem crescente: " + numero2 +" "+ numero1);
		} else if (numero1 < numero2) {
			System.out.println("Em ordem crescente: " + numero1 +" "+ numero2);
		} else {
			System.out.println("esses números são iguais");
		}
		scanner.close();
	}
}
