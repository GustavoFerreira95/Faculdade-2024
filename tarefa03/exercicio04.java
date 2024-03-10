/**
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
 * Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
 * calcular e escrever o custo final ao consumidor.
 */

package tarefa03;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do carro: ");
        double valorFabrica = scanner.nextInt();
        
        double percentualDistribuidor = 28.0/100;
        double percentualImpostos = 45.0/100;
        
        double custoDistribuidor = valorFabrica * percentualDistribuidor;
        double custoImpostos = valorFabrica * percentualImpostos;
        
        double custoConsumidor = valorFabrica + custoDistribuidor + custoImpostos;
        
        System.out.println("O valor do carro para o consumidor é de R$ :" + custoConsumidor);		
        
        scanner.close();
    }

}
