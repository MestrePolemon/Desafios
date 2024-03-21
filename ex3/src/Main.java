import java.util.Scanner;

public class Main extends ContaBancaria {

    public static void main(String[] args) {
        String numeroConta;
        int caso = 0;

        Scanner scanner = new Scanner(System.in);
        while (caso != 5) {

            System.out.println("1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Verificar saldo");
            System.out.println("5 - Sair");
            caso = scanner.nextInt();
            scanner.nextLine();

            switch (caso) {
                case 1:
                    ContaBancaria conta = new ContaBancaria();
                    System.out.println("Digite o nome do titular da conta: ");
                    conta.setTitular(scanner.nextLine());
                    System.out.println("Conta criada com sucesso!");
                    System.out.println("Titular: " + conta.getTitular());
                    System.out.println("Número da conta: " + conta.getNumeroConta());
                    ContaBancaria.contas.put(conta.getNumeroConta(), conta);
                    break;
                case 2:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = scanner.nextLine();
                    if (ContaBancaria.contas.containsKey(numeroConta)) {
                        System.out.println("Digite o valor a ser depositado: ");
                        float valor = scanner.nextFloat();
                        scanner.nextLine();
                        ContaBancaria.contas.get(numeroConta).Depositar(valor);
                        System.out.println("Depósito realizado com sucesso!");
                        System.out.println("Saldo atual: " + ContaBancaria.contas.get(numeroConta).getSaldo());
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 3:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = scanner.nextLine();
                    if (ContaBancaria.contas.containsKey((numeroConta))) {
                        System.out.println("Saldo atual: " + ContaBancaria.contas.get((numeroConta)).getSaldo());
                        System.out.println("Digite o valor a ser sacado: ");
                        float valor = scanner.nextFloat();
                        scanner.nextLine();
                        if (ContaBancaria.contas.get((numeroConta)).getSaldo() >= valor) {
                            ContaBancaria.contas.get((numeroConta)).Sacar(valor);
                            System.out.println("Saque realizado com sucesso!");
                            System.out.println("Saldo atual: " + ContaBancaria.contas.get((numeroConta)).getSaldo());
                        } else {
                            System.out.println("Saldo insuficiente!");
                        }
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 4:
                    System.out.println("Digite o número da conta: ");
                    numeroConta = scanner.nextLine();
                    if (ContaBancaria.contas.containsKey(numeroConta)) {
                        System.out.println("Saldo atual: " + ContaBancaria.contas.get(numeroConta).getSaldo());
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
