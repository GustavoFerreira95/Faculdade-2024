package tarefa11;
import java.util.Arrays;
public class Exercicio09 {
public static void main(String[] args) {

	// Remover Elemento: Desenvolva um programa que remova todas as ocorrências de um elemento específico de um vetor.

        int[] vetor = { 7, 4, 10, 8, 2, 5, 4, 8, 4 };

        int elementoParaRemover = 4;

        int novoTamanho = vetor.length;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elementoParaRemover) {
                novoTamanho--;            }
        }

        int[] novoVetor = new int[novoTamanho];
        int indexNovoVetor = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != elementoParaRemover) {
                novoVetor[indexNovoVetor] = vetor[i];
                indexNovoVetor++;
            }
        }

        System.out.println("Vetor após a remoção do elemento " + elementoParaRemover + ":");
        System.out.println(Arrays.toString(novoVetor));
	}

}
