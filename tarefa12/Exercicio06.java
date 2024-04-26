package tarefa12;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string para contar as vogais: ");
        String str = scanner.nextLine();
        System.out.println("O número de vogais na string é: " + contVogais(str));
        scanner.close();
    }

    public static int contVogais(String str) {
        int contar = 0;
        String vogais = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            if (vogais.indexOf(str.charAt(i)) != -1) {
            	contar++;
            }
        }
        return contar;
    }
}