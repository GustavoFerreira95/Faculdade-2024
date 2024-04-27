package tarefa12;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        int lado1 = scanner.nextInt();
        System.out.println("Digite o segundo lado: ");
        int lado2 = scanner.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int lado3 = scanner.nextInt();
        if (triangulo(lado1, lado2, lado3)) {
            System.out.println("Os lados formam um triângulo.");
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
        scanner.close();
	}

    public static boolean triangulo(int lado1, int lado2, int lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}