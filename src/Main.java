import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("""
                ***********************
                 Dados iniciais do cliente:
                 
                 Nome: Thiago Soares
                 Tipo conta: Corrente
                 Saldo inicial: R$ 2500,00
                 ***********************
                 """);

        Scanner leitura = new Scanner(System.in);
        int opcaoDesejada = 0;
        double saldoAtualizado =  2500.00;

        while (opcaoDesejada != 4) {
            System.out.println("""
                 
                 Operações
                 1- Consultar saldos
                 2- Receber valor
                 3- Transferir valor
                 4- Sair
                 
                 Digite a opção desejada:""");
            opcaoDesejada = leitura.nextInt();
            if (opcaoDesejada == 1){
                System.out.println("Saldo Atualizado = R$" + saldoAtualizado);
            }
            if (opcaoDesejada == 2){
                System.out.println("Informe o valor a receber:");
                double valorRecebido = leitura.nextDouble();
                saldoAtualizado = saldoAtualizado + valorRecebido;
                System.out.println("Saldo Atualizado = " + saldoAtualizado);
            }
            if (opcaoDesejada == 3){
                System.out.println("Informe o valor que deseja transferir:");
                double valorTransferido = leitura.nextDouble();
                if (valorTransferido > saldoAtualizado){
                    System.out.println("Não há saldo suficiente para fazer essa transferência");
                    System.out.println("Saldo Atualizado = " + saldoAtualizado);
                } else {
                    saldoAtualizado = saldoAtualizado - valorTransferido;
                    System.out.println("Saldo Atualizado = " + saldoAtualizado);
                }
            }

            if (opcaoDesejada < 1 || opcaoDesejada > 4){
                System.out.println("Opção Inválida");
            }
        }
    }
}