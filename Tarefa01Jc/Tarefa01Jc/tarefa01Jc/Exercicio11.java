package tarefa01Jc;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();
        System.out.println("Digite a base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();
        System.out.println("Digite a altura do trapézio: ");
        double altura = scanner.nextDouble();
        System.out.println("A área do trapézio é: " + ((baseMaior + baseMenor) * altura / 2));
        scanner.close();
    }
}