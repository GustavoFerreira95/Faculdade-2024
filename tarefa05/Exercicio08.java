// 8) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.


package tarefa05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o horário de ínicio da partida: ");
		int hrInicio = scanner.nextInt();

		System.out.print("Digite o horário final da partida: ");
		int hrFinal = scanner.nextInt();
		
		int horaTotal;

		if (hrFinal > hrInicio) {
			horaTotal = hrFinal - hrInicio;
		} else {
			horaTotal = (24 - hrInicio) + hrFinal;
		}
		System.out.println("Aduração do jogo é de " + horaTotal + " horas");
		scanner.close();
	}
}
