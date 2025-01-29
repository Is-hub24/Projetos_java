import java.util.Scanner;

// Abertura de classe
public class contaBancaria {

    public static void main(String[] args) {
        Scanner cliente = new Scanner(System.in);
        System.out.println("Digite o nome completo do cliente que deseja consultar:");
        String usuarioNome = cliente.nextLine();

        double saldoCliente = 2000.00;
        String tipoConta = "Corrente";

        System.out.println("*************************");
        System.out.println("Bem Vindo(a) " + usuarioNome);
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome: " + usuarioNome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldoCliente);
        System.out.println("*************************");

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("\nEste é o menu MyBank: \n\n" +
                    "1 - Consultar Saldos \n" +
                    "2 - Receber valor \n" +
                    "3 - Transferir valor \n" +
                    "4 - Sair ");
            System.out.println("*************************");
            System.out.println("Qual operação deseja realizar?");
            int num = scanner.nextInt();

            if (num == 1) {
                System.out.println("Seu saldo é: " + saldoCliente);
                System.out.println("Deseja fazer mais alguma operação?\n");

            } else if (num == 2) {
                System.out.println("Qual o valor recebido? ");
                double valor = scanner.nextDouble();
                saldoCliente += valor;  // Atualiza o saldo
                System.out.println("Saldo atualizado: " + saldoCliente);

            } else if (num == 3) {
                System.out.println("Qual o valor deseja transferir?");
                double valorSair = scanner.nextDouble();
                if (valorSair > saldoCliente) {
                    System.out.println("Saldo insuficiente para a transferência!");
                } else {
                    saldoCliente -= valorSair;  // Atualiza o saldo
                    System.out.println("Valor transferido com sucesso! \nSeu saldo atual é: " + saldoCliente);
                }
                System.out.println("Deseja fazer mais alguma operação?\n");

            } else if (num == 4) {
                System.out.println("Você saiu da sua conta.\nObrigado por utilizar o MyBank!");
                break;

            } else {
                System.out.println("Operação inválida, tente novamente.");
            }
        }

        // Fecha os Scanners
        cliente.close();
        scanner.close();
    }
}
