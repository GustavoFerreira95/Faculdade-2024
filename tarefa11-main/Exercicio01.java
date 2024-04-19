package tarefa11;
public class Exercicio01 {
public static void main(String[] args) {

	// Soma dos Elementos: Escreva um programa que calcule a soma de todos os elementos de um vetor de inteiros.


	int[] vetor = { 10, 20, 30, 40, 50 };

        int soma = 0; 
        
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
	}

}
