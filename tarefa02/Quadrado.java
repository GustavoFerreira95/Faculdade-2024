package tarefa02;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Digite o lado do quadrado: ");
        int numero1 = num1.nextInt();
       
        
        float result = (float) Math.pow(numero1, 2);
        System.out.println("A área do quadrado é de: " + result);
        num1.close();

    }
}
