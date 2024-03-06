import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        boolean pertenceSequencia = pertenceSequencia(numero);

        if (pertenceSequencia) {
            System.out.println("O numero " + numero + " pertence a sequencia.");
        } else {
            System.out.println("O numero " + numero + " nao pertence a sequencia");
        }
    }

    public static boolean pertenceSequencia(int numero) {
        int a = 0;
        int b = 1;

        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        return false;
    }

}

