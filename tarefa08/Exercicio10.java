package tarefa08;

public class Exercicio10 {
    public static void main(String[] args) {
        int soma = 0;
        int contador = 0;
        for (int i = 50; i <= 70; i++) {
            if (i % 2 == 0) {
                soma += i;
                contador++;
            }
        }

        double media = soma / (double) contador;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}