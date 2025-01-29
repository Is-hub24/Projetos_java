import java.util.Scanner;

public class celsiusEfar {
    public static void main(String[] args) {
        System.out.println("Escreva a temperatura que deseja converter de Celcuis para Fahrenheit: ");

        Scanner temp= new Scanner(System.in);
        float temperatura = temp.nextFloat();
        float conversao = (float) ((temperatura * 1.8f) + 32);

        System.out.printf("%.1f fahrenheit", conversao);

        }
    }