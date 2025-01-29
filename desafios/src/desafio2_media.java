import java.util.Scanner;

public class desafio2_media {
    public static void main(String[] args) {
        System.out.println("Escreva dois numeros para calcularmos a media entre eles: ");
        Scanner numero1 = new Scanner(System.in);
        Scanner numero2 = new Scanner(System.in);

        float entrada1 = numero1.nextInt();
        float entrada2 = numero2.nextInt();
        float media = (entrada1 + entrada2) /2;
        System.out.println("A media é: " + media);

        }
    }