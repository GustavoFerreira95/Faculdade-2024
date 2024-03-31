/**4) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada. **/
package tarefa05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int notaFinal;
		
		System.out.print("Digite a nota do primeiro semestre: ");
		int notaAluno1 = scanner.nextInt();
		
		System.out.print("Digite a nota do segundo semestre: ");
		int notaAluno2 = scanner.nextInt();
			
		notaFinal = (notaAluno1 + notaAluno2)/2; 
        
		if (notaFinal >= 6) { 	
        	System.out.println("Aluno Aprovado: "+notaFinal);
			} else {
				System.out.println("Aluno Reprovado: "+notaFinal);
			}
        scanner.close();
	}

}
