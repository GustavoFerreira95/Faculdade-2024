package tarefa04;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
        int valorA = scanner.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int valorB = scanner.nextInt();
        
        System.out.print("Digite o valor de C: ");
        int valorC = scanner.nextInt();
        
        
        System.out.println ("Resultados da adição:");
        double soma = ((int) Math.pow(valorA,2) + Math.pow(valorB,2) + Math.pow(valorC,2));
        System.out.println ("o valor do quadrado da soma é de = " + soma);
        
        scanner.close();
        
	}

}