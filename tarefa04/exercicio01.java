package tarefa04;

import java.util.Scanner;

public class exercicio01 {

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
        
        System.out.println ("Resultados da adição:");
        System.out.println ("A+B = " + (valorA + valorB));
        System.out.println ("A+C = " + (valorA + valorC));
        System.out.println ("A+D = " + (valorA + valorD));
        System.out.println ("B+C = " + (valorB + valorC));
        System.out.println ("B+D = " + (valorB + valorD));
        System.out.println ("C+D = " + (valorC + valorD));
        
        System.out.println ("Resultados da multiplicação:");
        System.out.println ("A*B = " + (valorA * valorB));
        System.out.println ("A*C = " + (valorA * valorC));
        System.out.println ("A*D = " + (valorA * valorD));
        System.out.println ("B*C = " + (valorB * valorC));
        System.out.println ("B*D = " + (valorB * valorD));
        System.out.println ("C*D = " + (valorC * valorD));
        
        scanner.close();
        
	}

}
