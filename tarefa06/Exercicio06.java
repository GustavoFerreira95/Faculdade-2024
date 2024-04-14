package tarefa06;

	import java.util.Scanner;

	public class Exercicio06 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor de A:");
	        int valorA = scanner.nextInt();

	        System.out.println("Digite o valor de B:");
	        int valorB = scanner.nextInt();

	        System.out.println("Digite o valor de C:");
	        int valorC = scanner.nextInt();

	        int temp;
	        if (valorA > valorB) {
	            temp = valorA;
	            valorA = valorB;
	            valorB = temp;
	        }
	        if (valorB > valorC) {
	            temp = valorB;
	            valorB = valorC;
	            valorC = temp;
	        }
	        if (valorA > valorB) {
	            temp = valorA;
	            valorA = valorB;
	            valorB = temp;
	        }

	        System.out.println("Os valores em ordem crescente são: " + valorA + ", " + valorB + ", " + valorC);

	        scanner.close();
	    }
	}
