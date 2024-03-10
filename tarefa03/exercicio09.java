/**
 * Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).
 */

package tarefa03;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da prestação: ");
        int valPrestacao = scanner.nextInt();
        
        System.out.print("Digite a taxa da prestação em atraso: ");
        int porcTaxa = scanner.nextInt();
        
        System.out.print("Digite quantos dias de atraso: ");
        int diasAtraso = scanner.nextInt();
        
        int prestacaoAtraso = valPrestacao+(valPrestacao * porcTaxa / 100) * diasAtraso;
        System.out.print("O valor da prestação em atraso é de R$: "+prestacaoAtraso);
        
        
        scanner.close();
    }
}