package tarefa04;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);{
		
	        System.out.print("Digite a quantidade de votos válidos para o candidato A: ");
	        int votosA = scanner.nextInt();

	        System.out.print("Digite a quantidade de votos válidos para o candidato B: ");
	        int votosB = scanner.nextInt();

	        System.out.print("Digite a quantidade de votos válidos para o candidato C: ");
	        int votosC = scanner.nextInt();

	        System.out.print("Digite a quantidade de votos nulos: ");
	        int votosNulos = scanner.nextInt();

	        System.out.print("Digite a quantidade de votos em branco: ");
	        int votosBranco = scanner.nextInt();

	        int totalEleitores = votosA + votosB + votosC + votosNulos + votosBranco;

	        
	        double percentualVotosValidos = ((double) (votosA + votosB + votosC) / totalEleitores) * 100;
	        double percentualA = ((double) votosA / totalEleitores) * 100;
	        double percentualB = ((double) votosB / totalEleitores) * 100;
	        double percentualC = ((double) votosC / totalEleitores) * 100;
	        double percentualNulos = ((double) votosNulos / totalEleitores) * 100;
	        double percentualBranco = ((double) votosBranco / totalEleitores) * 100;

	        
	        System.out.println("Resultados da eleição:");
	        System.out.println("Total de eleitores: " + totalEleitores);
	        System.out.printf("Percentual de votos válidos em relação ao total de eleitores: ", percentualVotosValidos);
	        System.out.printf("Percentual de votos válidos do candidato A: ", percentualA);
	        System.out.printf("Percentual de votos válidos do candidato B: ", percentualB);
	        System.out.printf("Percentual de votos válidos do candidato C: ", percentualC);
	        System.out.printf("Percentual de votos nulos: ", percentualNulos);
	        System.out.printf("Percentual de votos em branco: ", percentualBranco);
	
	        scanner.close();
		}
	}
}
