package tarefa11;
import java.util.Scanner;
public class Exercicio08 {
public static void main(String[] args) {

	// Buscar Elemento: Escreva um programa que verifique se um determinado elemento está presente em um vetor.

	int[] vetor = { 7, 4, 10, 8, 2, 5 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o elemento a ser buscado: ");
        int elementoBuscado = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elementoBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O elemento " + elementoBuscado + " está presente no vetor.");
        } else {
            System.out.println("O elemento " + elementoBuscado + " não foi encontrado no vetor.");
        }
        input.close();
	}

	public static double calcularArea(double largura, double comprimento) {
        return largura * comprimento;

	scanner.close();

	}

}
