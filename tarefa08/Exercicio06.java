package tarefa08;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = scanner.nextInt();

        System.out.println("Digite o expoente: ");
        int expoente = scanner.nextInt();

        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}