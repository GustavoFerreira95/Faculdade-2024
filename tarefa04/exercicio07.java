package tarefa04;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
        int valorA = scanner.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int valorB = scanner.nextInt();
        
        System.out.print("Digite o valor de C: ");
        int valorC = scanner.nextInt();
        
        
        System.out.println ("Resultados da adição:");
        int soma = valorA+valorB+valorC;
        System.out.println ("o valor da soma ao quadrado = " + Math.pow(soma, 2));
        
        scanner.close();
        
	}

}