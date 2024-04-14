package tarefa06;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int valNum = sc.nextInt();

        int numAbs;
        if (valNum < 0) {
            numAbs = - valNum;
        } else {
            numAbs = valNum;
        }

        System.out.println("O valor absoluto do número digitado é: " + numAbs);

        sc.close();
    }
}
