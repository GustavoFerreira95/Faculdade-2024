/**
 * Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. 
 * A fórmula deconversão é C=(ºF-32)*(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 */

package tarefa03;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.print("Digite a temperatura: ");
        int tempFahr = scanner.nextInt();
        
        double tempCels = (tempFahr - 32) * 5/9;
        
        System.out.println("A temperatura em Fahrenheit é de :" + tempCels + "º");
        
        scanner.close();
    	
    }
}
