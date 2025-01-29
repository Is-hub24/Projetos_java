import java.util.Random;
import java.util.Scanner;

public class jogoDeAdivinhacao {
    public static void main(String[] args) {
        System.out.println("Esta pronto para adivinhar? ");
        Scanner entrada = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 10) {
            System.out.println("Digite um numero de 0 a 100");
            numeroDigitado = entrada.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabens!! Voce adivinhou! :D");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O numero digitado é menor que o numero gerado! ");

            } else {
                System.out.println("O numero digitado é maior que o numero gerado");
            }

        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Voce nao conseguiu acertar");
            System.out.println("O numero gerado foi: " + numeroGerado);
        }
    }
}
