package tarefa12;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite a base: ");
	        int base = scanner.nextInt();
	        System.out.println("Digite o expoente: ");
	        int expo = scanner.nextInt();
	        System.out.println("O resultado de " + base + " elevado a " + expo + " é: " + potencia(base, expo));
	        scanner.close();
	    }

	    public static long potencia(int base, int expo) {
	    	long resultado = 1;
	        for (int i = 0; i < expo; i++) {
	            resultado *= base;
	        }
	        return resultado;
	    }
	}