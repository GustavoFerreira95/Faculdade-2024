package tarefa13jc;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite um ano:");
	        int ano = scanner.nextInt();
	        System.out.println(Bissexto(ano) ? "O ano é bissexto" : "O ano não é bissexto");
	        scanner.close();
	    }

	    public static boolean Bissexto(int ano) {
	        if (ano % 4 != 0) {
	            return false;
	        } else if (ano % 400 == 0) {
	            return true;
	        } else if (ano % 100 == 0) {
	            return false;
	        } else {
	            return true;
	        }
	    }
	}