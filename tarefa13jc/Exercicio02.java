package tarefa13jc;
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        System.out.println("O quadrado do número é " + quadrado(numero));
        scanner.close();
    }

    public static int quadrado(int numero) {
        return numero * numero;
    }
}