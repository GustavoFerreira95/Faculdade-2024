package tarefa06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int num1 = sc.nextInt();
		
		System.out.println("Digite outro valor");
		int num2 = sc.nextInt();
		
		int maior, menor;
        if (num1 > num2) {
            maior = num1;
            menor = num2;
        } else {
            maior = num2;
            menor = num1;
        }
        
        int diferenca = maior - menor;
        
        System.out.println("A diferença entre o maior e o menor valor é: " + diferenca);
        sc.close();
	}
}

