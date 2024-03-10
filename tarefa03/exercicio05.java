/**
 * Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
 * A fórmula de conversão é F = (ºC x 9/5) + 32, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 */

package tarefa03;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.print("Digite a temperatura: ");
        int tempCels = scanner.nextInt();
        
        double tempFahr = (tempCels * 9/5) + 32;
        
        System.out.println("A temperatura em Fahrenheit é de :" + tempFahr + "º");
        
        scanner.close();
    	
    }
}
