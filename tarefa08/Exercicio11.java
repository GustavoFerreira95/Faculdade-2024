package tarefa08;

import java.util.Scanner;


public class Exercicio11 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double areaTotal = 0;

	        while (true) {
	            System.out.println("Digite o nome do cômodo: ");
	            String nomeComodo = scanner.next();

	            System.out.println("Digite a largura do cômodo: ");
	            double largura = scanner.nextDouble();

	            System.out.println("Digite o comprimento do cômodo: ");
	            double comprimento = scanner.nextDouble();

	            double areaComodo = largura * comprimento;
	            areaTotal += areaComodo;

	            System.out.println("Área do " + nomeComodo + ": " + areaComodo);

	            System.out.println("Deseja continuar calculando novos cômodos? (SIM/NAO)");
	            String resposta = scanner.next();

	            if (resposta.equalsIgnoreCase("NAO")) {
	                break;
	            }
	        }

	        System.out.println("Área total da residência: " + areaTotal);

	        scanner.close();
	    }
	}