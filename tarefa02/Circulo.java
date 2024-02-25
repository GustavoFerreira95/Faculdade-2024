package tarefa02;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        int numero = num.nextInt();
        
        
        float result = (float) ((float) Math.PI * Math.pow(numero, 2));
        System.out.println("A área do circulo é de: " + result);
        num.close();

    }
}
