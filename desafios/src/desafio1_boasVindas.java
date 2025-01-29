import java.util.Scanner;

public class desafio1_boasVindas {
    public static void main(String[] args) {
        Scanner ent_nome = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        String nome = ent_nome.nextLine();

        System.out.print("Bem vinda!" + nome);
        System.out.print("Tudo bem?");

        Scanner ent_estudos = new Scanner(System.in);

        System.out.print("\nO que voce estudou hoje? ");
        String estudos = ent_estudos.nextLine();

        System.out.print("Hoje voce estudou: " + estudos);

        ent_estudos.close();
    }

}
