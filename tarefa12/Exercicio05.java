package tarefa12;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string para inverter: ");
        String str = scanner.nextLine();
        System.out.println("A string invertida é: " + inverter(str));
        scanner.close();
    }

    public static String inverter(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}