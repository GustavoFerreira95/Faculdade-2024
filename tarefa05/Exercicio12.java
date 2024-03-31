// 12) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidademédia = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.

package tarefa05;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a quantidade do estoque atual: ");
		int estqAtt = scanner.nextInt();

		System.out.println("Digite a quantidade do estoque máximo: ");
		int estqMax = scanner.nextInt();
		
		System.out.println("Digite a quantidade do estoque mínimo: ");
		int estqMin = scanner.nextInt();
		
		int estqMed = (estqMax + estqMin) / 2;

		if (estqAtt >= estqMed) {
			System.out.println("Não efetuar a compa do estoque");
		} else {
			System.out.println("Efetuar a compa do estoque");
		}
		scanner.close();
	}
}
