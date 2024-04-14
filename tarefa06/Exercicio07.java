package tarefa06;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        int num3 = scanner.nextInt();

        System.out.println("Digite o quarto número:");
        int num4 = scanner.nextInt();

        System.out.println("Números divisíveis por 2 e 3:");
        divisivel(num1);
        divisivel(num2);
        divisivel(num3);
        divisivel(num4);

        scanner.close();
    }

    public static void divisivel(int num) {
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println(num);
        }
    }
}
