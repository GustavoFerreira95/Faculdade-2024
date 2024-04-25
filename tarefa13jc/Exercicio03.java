package tarefa13jc;
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite um número:");
	        int numero = scanner.nextInt();
	        System.out.println(verificarNumero(numero));
	        scanner.close(); // Fechando o scanner
	    }

	    public static String verificarNumero(int numero) {
	        if (numero > 0) {
	            return "O número é positivo.";
	        } else if (numero < 0) {
	            return "O número é negativo.";
	        } else {
	            return "O número é zero.";
	        }
	    }
	}