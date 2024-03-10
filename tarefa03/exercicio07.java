/**
 * Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π * Raio2 * Altura
 */

package tarefa03;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o raio da lata: ");
        int raioLata = scanner.nextInt();
        
        System.out.print("Digite a altura da lata: ");
        int alturaLata = scanner.nextInt();
        
        int volumeLata = (int)(Math.PI * Math.pow(raioLata,2) * alturaLata);
        
        System.out.println("O volume da lata é de: " + volumeLata);
        
        scanner.close();

    }
}
