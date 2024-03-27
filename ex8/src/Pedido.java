import java.util.ArrayList;
import java.util.List;

public class Pedido extends Pizza {

    private String numeroPedido;
    private String endereco;
    private String descricao;
    private int quantidade;
    static private int proximoPedido = 0;
    private Pizzaria pizzaria;

    public Pedido(Pizzaria pizzaria) {
        this.numeroPedido = String.format("%05d", proximoPedido++);
        this.endereco = "";
        this.descricao = "";
        this.quantidade = 0;
        this.pizzaria = pizzaria;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void CadastrarPedido() {
        Pedido pedido = new Pedido(pizzaria);
        System.out.println("Digite o endereço de entrega: ");
        pedido.setEndereco(scanner.nextLine());
        System.out.println("Escolha a pizza: ");
        for (int i = 0; i < pizzaria.getPizzas().size(); i++) {
            System.out.println((i + 1) + " - " + pizzaria.getPizzas().get(i).getSabor());
        }
        System.out.println("Caso deseje uma pizza que não está na lista, digite 0");
        int escolha = scanner.nextInt();
        scanner.nextLine();
        if (escolha == 0) {
            Pizza novaPizza = new Pizza().CadastrarPizza();
            pizzaria.getPizzas().add(novaPizza);
            escolha = pizzaria.getPizzas().size(); // assume que a nova pizza é adicionada no final da lista
        }
        System.out.println("Deseja adicionar alguma observação? ");
        pedido.setDescricao(scanner.nextLine());
        System.out.println("Digite a quantidade de pizzas: ");
        pedido.setQuantidade(scanner.nextInt());
        scanner.nextLine();
        if (!pizzaria.getPizzas().isEmpty()) {
            System.out.println("Pedido: " + pedido.getNumeroPedido() + "\n Endereço: " + pedido.getEndereco()
                    + "\n Pizza: " + pizzaria.getPizzas().get(escolha - 1).getSabor() +
                    "\n Observação: " + pedido.getDescricao() + "\n Quantidade: " + pedido.getQuantidade()
                    + "\n Preço: " + pizzaria.getPizzas().get(escolha - 1).getPreco() * pedido.getQuantidade());
        }
        System.out.println("Pedido cadastrado com sucesso!");
        pizzaria.cadastrarPedido(pedido);
    }

    public void CancelarPedido() {
        System.out.println("Digite o número do pedido que deseja cancelar: ");
        String cancelar = scanner.nextLine();
        for (int i = 0; i < pizzaria.getPedidos().size(); i++) {
            if (pizzaria.getPedidos().get(i).getNumeroPedido().equals(cancelar)) {
                pizzaria.getPedidos().remove(i);
                System.out.println("Pedido cancelado com sucesso!");
            }
        }
    }

    public void Media() {
        double media = 0;
        for (int i = 0; i < pizzaria.getPedidos().size(); i++) {
            media += pizzaria.getPizzas().get(i).getPreco() * pizzaria.getPedidos().get(i).getQuantidade();
        }
        if (pizzaria.getPedidos().size() > 0) {
            media = media / pizzaria.getPedidos().size();
        }
        System.out.println("Média de preço dos pedidos: " + media);
    }

    public void ListarPedidos() {
        int quantidadePedidos = 0;
        for (int i = 0; i < pizzaria.getPedidos().size(); i++) {
            System.out.println("______________________________");
            System.out.println("Pedido: " + pizzaria.getPedidos().get(i).getNumeroPedido() + "\n Endereço: "
                    + pizzaria.getPedidos().get(i).getEndereco() + "\n Pizza: " + pizzaria.getPizzas().get(i).getSabor()
                    +
                    "\n Observação: " + pizzaria.getPedidos().get(i).getDescricao() + "\n Quantidade: "
                    + pizzaria.getPedidos().get(i).getQuantidade() + "\n Preço: "
                    + pizzaria.getPizzas().get(i).getPreco() * pizzaria.getPedidos().get(i).getQuantidade());
            System.out.println("______________________________");
            quantidadePedidos++;
        }
        System.out.println("Quantidade de pedidos: " + quantidadePedidos);

        Media();
    }

}
