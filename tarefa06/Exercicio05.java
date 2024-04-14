package tarefa06;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de Delta (deve ser diferente de zero):");
        double delta = scanner.nextDouble();

        if (delta == 0) {
            System.out.println("O valor de Delta deve ser diferente de zero para uma equação de segundo grau.");
            scanner.close();
            return;
        }

        System.out.println("Digite o valor de B:");
        double valorB = scanner.nextDouble();

        System.out.println("Digite o valor de C:");
        double valorC = scanner.nextDouble();

        
        double discriminante = valorB * valorB - 4 * delta * valorC;

        if (discriminante < 0) {
            System.out.println("Não existem raízes reais para esta equação.");
        } else if (discriminante == 0) {
            double raiz = -valorB / (2 * delta);
            System.out.println("A equação possui uma raiz real: " + raiz);
        } else {
            double raiz1 = (-valorB + Math.sqrt(discriminante)) / (2 * delta);
            double raiz2 = (-valorB - Math.sqrt(discriminante)) / (2 * delta);
            System.out.println("As raízes reais da equação são: " + raiz1 + " e " + raiz2);
        }

        scanner.close();
    }
}
