import java.util.ArrayList;
import java.util.List;

public class Pizzaria {
    List<Pizza> pizzas = new ArrayList<>();
    List<Pedido> pedidos = new ArrayList<>();

    public void cadastrarNovaPizza() {
        Pizza pizza = new Pizza().CadastrarPizza();
        pizzas.add(pizza);
    }

    public void cadastrarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}