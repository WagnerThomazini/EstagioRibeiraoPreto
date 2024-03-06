public class Exercicio03 {
    public static void main(String[] args) {

        calcularProximoElemento("a", 7);
        calcularProximoElemento("b", 64);
        calcularProximoElemento("c", 36);
        calcularProximoElemento("d", 64);
        calcularProximoElemento("e", 8);

    }

    public static void calcularProximoElemento(String sequencia, int ultimoElemento) {
        int proximoElemento = 0;
        switch (sequencia) {
            case "a":
                proximoElemento = ultimoElemento + 2;
                break;
            case "b":
                proximoElemento = ultimoElemento * 2;
                break;
            case "c":
                proximoElemento = (int) Math.pow(Math.sqrt(ultimoElemento) + 1, 2);
                break;
            case "d":
                proximoElemento = (int) Math.pow(Math.sqrt(ultimoElemento) + 2, 2);
                break;
            case "e":
                proximoElemento = calcularProximoFibonacci(ultimoElemento);
                break;
            default:
                System.out.println("Sequencia nao reconhecida.");
                return;
        }

        System.out.println("Proximo elemento da sequencia " + sequencia + ": " + proximoElemento);
    }

    public static int calcularProximoFibonacci(int ultimoElemento) {
        int a = 0;
        int b = 1;
        while (a <= ultimoElemento) {
            if (a == ultimoElemento) {
                return a + b;
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return 0;
    }
}
