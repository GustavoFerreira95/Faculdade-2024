/**
 *  Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
 *  Calcular e escrever o valor do novo salário.
 */

package tarefa03;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário mensal: ");
        int salarioMensal = scanner.nextInt();
        
        System.out.print("Digite a porcentagem de aumento: ");
        int porcentagem = scanner.nextInt();
        
        int salarioComPorcentagem = (salarioMensal * porcentagem) /100;
        
        int valorReajuste = salarioComPorcentagem + salarioMensal;
        System.out.println("O aumento do salario foi de R$ :" + valorReajuste + " o aumento do salário é de R$: " +salarioComPorcentagem);		
        
        scanner.close();
    }

}
