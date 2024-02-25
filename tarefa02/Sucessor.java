package tarefa02;

import java.util.Scanner;

public class Sucessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int result = numero + 1;
        System.out.println("O sucessor de " + numero + " é: " + result);
        scanner.close();
    }
}
