package tarefa12;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio04 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        ArrayList<Integer> numeros = new ArrayList<Integer>();

	        System.out.println("Digite os números para calcular a média (digite uma letra para mostar o resultado): ");
	        while (scanner.hasNextInt()) {
	        	numeros.add(scanner.nextInt());
	        }

	        if (!numeros.isEmpty()) {
	            double media = calcMedia(numeros);
	            System.out.println("A média dos números digitados é: " + media);
	        } else {
	            System.out.println("Nenhum número foi digitado.");
	        }

	        scanner.close();
	    }

	    public static double calcMedia(ArrayList<Integer> numbers) {
	        int soma = 0;
	        for (int num : numbers) {
	        	soma += num;
	        }
	        return (double) soma / numbers.size();
	    }
	}