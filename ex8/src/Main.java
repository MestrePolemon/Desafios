import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Pizza pizza = new Pizza();
        Pizzaria pizzaria = new Pizzaria();
        Pedido pedido = new Pedido(pizzaria);

        int opcao = 0;

        do {
            System.out.println("1 - Cadastrar pizza");
            System.out.println("2 - Cadastrar pedido");
            System.out.println("3 - Cancelar pedido");
            System.out.println("4 - Listar pedidos");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    pizzaria.cadastrarNovaPizza();
                    break;
                case 2:
                    pedido.CadastrarPedido();
                    break;
                case 3:
                    pedido.CancelarPedido();;
                    break;
                case 4:
                    pedido.ListarPedidos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 5);
    }
}
