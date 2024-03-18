package tarefa04;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
        int valorA = scanner.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int valorB = scanner.nextInt();
        
        System.out.print("Digite o valor de C: ");
        int valorC = scanner.nextInt();
        
        System.out.print("Digite o valor de D: ");
        int valorD = scanner.nextInt();
        
        int valorP = valorA+valorC;
        System.out.println ("Resultado da soma A+C = " + valorP);
        
        int valorS = valorB+valorD;
        System.out.println ("Resultado da soma B+D = " + valorS);
        
        scanner.close();
        
	}

}