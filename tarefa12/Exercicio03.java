package tarefa12;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String txt = scanner.nextLine();
        String txtReversa = new StringBuilder(txt).reverse().toString();
        System.out.println(txt.equalsIgnoreCase(txtReversa) ? "A string é um palíndromo" : "A string não é um palíndromo");
        scanner.close();
    }
}