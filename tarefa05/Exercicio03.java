//3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se foremcompradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

package tarefa05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a quantidade de maçãs compradas: ");
        
		int quantMacas = scanner.nextInt();
		float valorFinal;
		float custoMacas = (float) 1.30;
		int custoMacas2 = 1;
		
        if (quantMacas < 12) {
			  valorFinal = custoMacas * quantMacas;  	
        	System.out.println("O preço das maçãs ficou em R$: "+ valorFinal);
			} else {
				valorFinal = custoMacas2 * quantMacas; 
				System.out.println("O preço das maçãs ficou em R$: "+ valorFinal);
			}
        scanner.close();
	}

}
