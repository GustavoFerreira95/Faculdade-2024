package tarefa13jc;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite a base do retângulo:");
	        double base = scanner.nextDouble();
	        System.out.println("Digite a altura do retângulo:");
	        double altura = scanner.nextDouble();
	        System.out.println("A área do retângulo é " + calcularArea(base, altura));
	        scanner.close();
	    }

	    public static double calcularArea(double base, double altura) {
	        return base * altura;
	    }
	}