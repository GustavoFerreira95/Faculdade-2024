package tarefa10;

public class Exercicio10 {
    public static void main(String[] args) {
        for (int celsius = 10; celsius <= 100; celsius += 10) {
            double fahrenheit = (9.0 * celsius + 160) / 5;
            System.out.printf("%d graus Celsius = %.2f graus Fahrenheit\n", celsius, fahrenheit);
        }
    }
}