package tarefa04;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);{
		
			System.out.print("Digite o valor do Comprimento: ");
	        int comprimento = scanner.nextInt();
	        
	        System.out.print("Digite o valor da Largura: ");
	        int largura = scanner.nextInt();
	        
	        System.out.print("Digite o valor da Altura: ");
	        int altura = scanner.nextInt();
	        
	        int volume = comprimento * largura * altura;
	        System.out.println("O volume da caixa é de = " + volume);
		
	        scanner.close();
		
		}
	}
}
