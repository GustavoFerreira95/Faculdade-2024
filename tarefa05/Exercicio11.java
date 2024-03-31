// 11) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.


package tarefa05;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número da conta do cliente: ");
		int numCC = scanner.nextInt();

		System.out.println("Digite o saldo da sua conta R$: ");
		double saldoCC = scanner.nextDouble();

		System.out.println("Digite os débitos feito em sua conta R$: ");
		double debitoCC = scanner.nextDouble();

		System.out.println("Digite o valor creditado em sua conta R$: ");
		double creditoCC = scanner.nextDouble();

		double saldoAtt;

		saldoAtt = saldoCC - debitoCC + creditoCC;

		if (saldoAtt >= 0) {
			System.out.println("Saldo Positivo");
		} else {
			System.out.println("Saldo negativo");
		}
		System.out.println("A conta: " + numCC + " ,está com o seguinte saldo R$: " + saldoAtt);

		scanner.close();
	}
}
