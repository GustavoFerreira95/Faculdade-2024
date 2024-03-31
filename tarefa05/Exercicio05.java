// 5) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

package tarefa05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o ano de nascimento: ");
		int anoNasc = scanner.nextInt();
		
		int anoAtual = 2024;
		int anoVotacao;
		
		anoVotacao = anoAtual - anoNasc;
		
        if (anoVotacao >= 16) {
			  System.out.println("Pode votar");
			} else {
				System.out.println("Não pode votar");
			}
        scanner.close();
	}

}
