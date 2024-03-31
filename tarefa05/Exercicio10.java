// 10) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.


package tarefa05;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor do seu salário: ");
		float salFixo = scanner.nextFloat();
		
		System.out.print("Digite o valor das vendas feitas: ");
		float vendFeitas = scanner.nextFloat();
		float salReaj = 0;
		
		if (vendFeitas <= 1499) {
		    float percnt1 = 3.0f;
		    float comissao = vendFeitas * (percnt1 / 100);
		    salReaj += comissao + vendFeitas + salFixo;
		    System.out.println("O salário a receber é de: " + salReaj);
		} else {
			float percnt2 = 8.0f;
		    float comissao = vendFeitas * (percnt2 / 100);
		    salReaj += comissao + vendFeitas + salFixo;
		    System.out.println("O salário a receber com comissão é de R$: " + salReaj);
		}

		scanner.close();
	}

	}
