package tarefa07;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do usuário: ");
        int codigoUsuario = scanner.nextInt();

        int codigoCorreto = 1234;

        if (codigoUsuario != codigoCorreto) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.println("Digite a senha: ");
            int senha = scanner.nextInt();

            int senhaCorreta = 9999;

            if (senha != senhaCorreta) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Acesso permitido");
            }
        }

        scanner.close();
    }
}