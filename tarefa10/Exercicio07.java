package tarefa10;

public class Exercicio07 {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            int resultado = 1;
            for (int j = 0; j < i; j++) {
                resultado *= 3;
            }
            System.out.println("3 elevado a " + i + " = " + resultado);
        }
    }
}