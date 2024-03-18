package tarefa04;

import java.util.Scanner;
import java.util.Locale;

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);{
			
			System.out.print("Digite a cotação do dólar hoje: $");
	        double cotacao =(double) scanner.nextDouble();
			
			System.out.print("Digite o valor em real disponivel em sua conta: R$");
			double banco =(double) scanner.nextDouble();
	        
	        double conversao =(double) banco / cotacao;
	        
	        System.out.println("A conversão de R$"+ banco + " em dólares é $" + conversao);
		
	        scanner.close();
		}
	}

}
