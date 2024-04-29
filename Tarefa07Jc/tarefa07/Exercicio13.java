package tarefa07;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a descrição do produto: ");
        String descricaoProduto = scanner.nextLine();

        System.out.println("Digite a quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        System.out.println("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        double total = quantidade * precoUnitario;
        double desconto;

        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        double totalAPagar = total - desconto;

        String format = "%.2f%n";
        System.out.printf("Total: R$ " + format, total);
        System.out.printf("Desconto: R$ " + format, desconto);
        System.out.printf("Total a pagar: R$ " + format, totalAPagar);

        scanner.close();
    }
}