import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voce esta na sala com os interruptores.");
        System.out.println("Ligue um interruptor e entre na sala das lampadas.");

        System.out.println("Qual interruptor voce ligou? (1, 2 ou 3)");
        int interruptorLigado = scanner.nextInt();

        System.out.println("Voce esta na sala das lampadas. Por favor, identifique o estado de cada uma.");

        System.out.println("Lampada 1 esta acesa ou apagada? (responda com 'acesa' ou 'apagada')");
        String lampada1 = scanner.next().trim().toLowerCase();

        System.out.println("Lampada 2 esta acesa ou apagada? (responda com 'acesa' ou 'apagada')");
        String lampada2 = scanner.next().trim().toLowerCase();

        System.out.println("Lampada 3 esta acesa ou apagada? (responda com 'acesa' ou 'apagada')");
        String lampada3 = scanner.next().trim().toLowerCase();

        if (lampada1.equals("acesa")) {
            System.out.println("O interruptor " + interruptorLigado + " controla a lampada 1.");
        }
        if (lampada2.equals("acesa")) {
            System.out.println("O interruptor " + interruptorLigado + " controla a lampada 2.");
        }
        if (lampada3.equals("acesa")) {
            System.out.println("O interruptor " + interruptorLigado + " controla a lampada 3.");
        }
    }
}
