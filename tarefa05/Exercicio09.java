// 9) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).


package tarefa05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de horas trabalhadas na semana: ");
		int hrTrab = scanner.nextInt();
		
		int horasTotais = hrTrab * 5;
		
		System.out.print("Digite o valor da hora trabalhada: ");
		float valHrTrab = scanner.nextFloat();
		float salNormal;
		float salReaj = 0;

		if (hrTrab <= 40) {
			salNormal = horasTotais * valHrTrab;
			System.out.println("O salário a receber é de: "+ salNormal);
		} else {
			salNormal = horasTotais * valHrTrab;
			float hrExtra = hrTrab - 40;
			float percHrExtra = 50;
			float valHrExtra = valHrTrab * (1 + (percHrExtra / 100));
			salReaj =(40 * valHrTrab) + (hrExtra * valHrExtra);
			salReaj = salReaj + salNormal;
			System.out.println("O salário a receber com hora extra é de R$: " + salReaj);
		}
		scanner.close();
	}

	}
