package tarefa04;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);{
		
			System.out.print("Digite o valor de A: ");
	        int valorA = scanner.nextInt();
	        
	        System.out.print("Digite o valor de B: ");
	        int valorB = scanner.nextInt();
	        
	        int diferenca = valorA - valorB;
	        int quadDiferenca = (int) Math.pow(diferenca, 2);
	        
	        System.out.println("O valor do quadrado da diferença é = " + quadDiferenca);
		
	        scanner.close();
		}
	}
}
