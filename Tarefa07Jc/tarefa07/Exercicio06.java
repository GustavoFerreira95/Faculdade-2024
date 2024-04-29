package tarefa07;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do primeiro time: ");
        String time1 = scanner.nextLine();
        System.out.println("Digite o número de gols do primeiro time: ");
        int gols1 = scanner.nextInt();

        System.out.println("Digite o nome do segundo time: ");
        scanner.nextLine();
        String time2 = scanner.nextLine();
        System.out.println("Digite o número de gols do segundo time: ");
        int gols2 = scanner.nextInt();

        if (gols1 > gols2) {
            System.out.println("O vencedor é: " + time1);
        } else if (gols2 > gols1) {
            System.out.println("O vencedor é: " + time2);
        } else {
            System.out.println("EMPATE");
        }
        scanner.close();
    }
}