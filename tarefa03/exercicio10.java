/**
 * Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, 
 * e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. 
 * Apresentar os valores trocados.
 */

package tarefa03;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu primeiro nome: ");
        String primNome = scanner.next();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        
        String troca = primNome;
        
        String troca1 = primNome = sobrenome;
        
        String troca2 = sobrenome = troca;
        
        System.out.print("Digite seu sobrenome: " +troca1+" "+troca2);
        
        scanner.close();
    }
}