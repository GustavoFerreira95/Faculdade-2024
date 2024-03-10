/**
 * Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto

(TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da

distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS=DISTANCIA/12. Ao final, o programa deve apresentar os valores da velocidade

média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem.
 */

package tarefa03;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tempo da viagem: ");
        int tempoViagem = scanner.nextInt();
        
        System.out.print("Digite a velocidade média KM/H: ");
        int velMedia = scanner.nextInt();
        
        int distancia = tempoViagem * velMedia;
        
        int litrosGas = distancia / 12;
        
        System.out.println("A velocidade média do carro é de "+velMedia+" KM/H");
        
        System.out.println("O tempo gasto na viagem foi de "+tempoViagem+" Horas");
        
        System.out.println("A distancia da viagem foi de "+distancia+" Km");
        
        System.out.println("A quantidade de gasolina gasta foi "+litrosGas+" L");
        
        scanner.close();
        
    }
}
