package tarefa09;

public class Exercicio04 {
    public static void main(String[] args) {
        double graos = 1;
        double total = 0;
        for (int i = 1; i <= 64; i++) {
            total += graos;
            graos *= 2;
        }
        System.out.println("O total de grãos de trigo é: " + total);
    }
}