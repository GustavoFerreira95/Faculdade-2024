package tarefa07;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três números: ");
        int[] numeros = new int[3];
        numeros[0] = scanner.nextInt();
        numeros[1] = scanner.nextInt();
        numeros[2] = scanner.nextInt();

        Arrays.sort(numeros);

        System.out.println("Os números em ordem crescente são: " + Arrays.toString(numeros));
        scanner.close();
    }
}