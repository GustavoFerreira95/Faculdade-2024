package tarefa04;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);{
		
			System.out.print("Digite o valor do salário: ");
	        double salMensal = scanner.nextDouble();
	        
	        System.out.print("Digite a porcentagem do reajuste: ");
	        double reajustePorc = scanner.nextDouble();
	        
	        double calculo1 = reajustePorc / 100;
	        
	        double novoSalario = calculo1 * salMensal;
	        
	        System.out.println("O novo salario com reajuste de = " + reajustePorc + "%" + ", o valor do reajuste é de R$ "+ novoSalario + ", o total do novo salário é R$ " + (novoSalario+salMensal));
		
	        scanner.close();
		}
	}
}
