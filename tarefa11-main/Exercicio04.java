package tarefa11;
import java.util.Scanner;
public class Exercicio04 {
public static void main(String[] args) {

	//Vetor Invertido: Implemente um programa que inverta a ordem dos elementos em um vetor.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        double[] vetor = new double[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextDouble();
        }

        double[] vetorInvertido = new double[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorInvertido[tamanho - 1 - i] = vetor[i];
        }

        System.out.println("Vetor invertido:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorInvertido[i] + " ");
        }

        scanner.close();
	}

}
