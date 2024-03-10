/**
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade 
 * dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 */
package tarefa03;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a sua idade : ");
        byte anos = scanner.nextByte();
        
        System.out.print("Digite quantos meses desde o seu último aniversário : ");
        short meses = scanner.nextShort();
        
        System.out.print("Digite o dia de hoje : ");
        byte dias = scanner.nextByte();
        
        int idadeEmDias = anos * 365 + meses * 30 + dias;
        System.out.println("A idade em dias é de : " + idadeEmDias);
        
        scanner.close();
        

    }
}