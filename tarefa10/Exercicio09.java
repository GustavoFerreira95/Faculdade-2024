package tarefa10;

public class Exercicio09 {
    public static void main(String[] args) {
        int termo1 = 1, termo2 = 1;
        System.out.println(termo1);
        System.out.println(termo2);

        for (int i = 3; i <= 15; i++) {
            int proximoTermo = termo1 + termo2;
            System.out.println(proximoTermo);
            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }
}