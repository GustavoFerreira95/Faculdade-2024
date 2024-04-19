package tarefa11;
import java.util.Arrays;
public class Exercicio10 {
public static void main(String[] args) {

	// União de Vetores: Crie um programa que una dois vetores em um terceiro vetor, mantendo a ordem dos elementos.

       int[] vetor1 = { 7, 4, 10, 8 };
       int[] vetor2 = { 2, 5, 4, 8 };

       int tamanhoVetorResultado = vetor1.length + vetor2.length;

       int[] vetorResultado = new int[tamanhoVetorResultado];

       System.arraycopy(vetor1, 0, vetorResultado, 0, vetor1.length);

       System.arraycopy(vetor2, 0, vetorResultado, vetor1.length, vetor2.length);

       Arrays.sort(vetorResultado);

       System.out.println("Vetor resultante após a união e ordenação:");
        for (int i = 0; i < vetorResultado.length; i++) {
            System.out.print(vetorResultado[i] + " ");
        }
}

}
