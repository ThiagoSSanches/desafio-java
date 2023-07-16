import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Fulano de Tal";
        String tipoConta = "Corrente";
        double saldoAtualizado = 2570.99;
        int opcaoDesejada = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nomeCliente);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldoAtualizado);
        System.out.println("\n***********************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcaoDesejada != 4) {
            System.out.println(menu);
            opcaoDesejada = leitura.nextInt();

            if (opcaoDesejada == 1){
                System.out.println("Saldo Atualizado = R$" + saldoAtualizado);
            } else if (opcaoDesejada == 2) {
                System.out.println("Informe o valor recebido: ");
                double valorRecebido = leitura.nextDouble();
                saldoAtualizado += valorRecebido;
                System.out.println("Saldo Atualizado = " + saldoAtualizado);
            } else if (opcaoDesejada == 3){
                System.out.println("Informe o valor que deseja transferir: ");
                double valorTransferido = leitura.nextDouble();
                if (valorTransferido > saldoAtualizado){
                    System.out.println("Não há saldo suficiente para fazer essa transferência");
                    System.out.println("Saldo Atualizado = " + saldoAtualizado);
                } else {
                    saldoAtualizado -= valorTransferido;
                    System.out.println("Saldo Atualizado = " + saldoAtualizado);
                }
            } else if (opcaoDesejada != 4) {
                System.out.println("Opção Inválida");
            }
        }
    }
}