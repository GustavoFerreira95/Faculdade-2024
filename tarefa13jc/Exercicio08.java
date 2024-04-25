package tarefa13jc;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        System.out.println("O fatorial do número é " + calcularFatorial(numero));
        scanner.close();
    }

    public static long calcularFatorial(int numero) {
    	 if (numero == 0) {
             return 1;
         } else {
             return numero * calcularFatorial(numero - 1);
         }
     }
 }