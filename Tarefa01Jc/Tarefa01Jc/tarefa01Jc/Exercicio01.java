package tarefa01Jc;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        System.out.println("O número sucessor de " + num + " é: " + (num + 1));
        scanner.close();
    }
}