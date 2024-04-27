package tarefa01Jc;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a diagonal maior do losango: ");
        double diagonalMaior = scanner.nextDouble();
        System.out.println("Digite a diagonal menor do losango: ");
        double diagonalMenor = scanner.nextDouble();
        System.out.println("A área do losango é: " + (diagonalMaior * diagonalMenor / 2));
        scanner.close();
    }
}