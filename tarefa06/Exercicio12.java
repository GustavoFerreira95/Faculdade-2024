package tarefa06;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Leitura do nome
            System.out.println("Digite o nome da pessoa:");
            String nome = scanner.nextLine();

            // Leitura do sexo
            System.out.println("Digite o sexo da pessoa (M para masculino, F para feminino):");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); // Limpar o buffer de entrada

            // Verificação do sexo e saudação correspondente
            if (sexo == 'M' || sexo == 'm') {
                System.out.println("Ilmo Sr. " + nome);
                break; // Sai do loop
            } else if (sexo == 'F' || sexo == 'f') {
                System.out.println("Ilma Sra. " + nome);
                break; // Sai do loop
            } else {
                System.out.println("Sexo inválido. Por favor, digite M para masculino ou F para feminino.");
            }
        }

        scanner.close();
    }
}
