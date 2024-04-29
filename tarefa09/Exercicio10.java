package tarefa09;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.println("Digite o divisor: ");
        int divisor = scanner.nextInt();

        int quociente = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            quociente++;
        }

        System.out.println("O resultado da divisão é: " + quociente);

        scanner.close();
    }
}