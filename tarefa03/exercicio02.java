/**
 * Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
 * Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
 */

package tarefa03;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();
        
        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();
        
        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();
        
        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();
        
        double percentualBrancos = calcularPercentual(votosBrancos, totalEleitores);
        double percentualNulos = calcularPercentual(votosNulos, totalEleitores);
        double percentualValidos = calcularPercentual(votosValidos, totalEleitores);
        
        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
        
        scanner.close();
    }
    
    public static double calcularPercentual(int votos, int totalEleitores) {
        return (votos * 100.0) / totalEleitores;
    }
}
