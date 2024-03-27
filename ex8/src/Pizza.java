import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizza {

    private String sabor;
    private String ingredientes;
    private double preco;
    Scanner scanner = new Scanner(System.in);

    public Pizza() {
        this.sabor = "";
        this.ingredientes = "";
        this.preco = 0.0;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

   

    public Pizza CadastrarPizza() {
        Pizza pizza = new Pizza();
        System.out.println("Digite o sabor da pizza: ");
        pizza.setSabor(scanner.nextLine());
        System.out.println("Digite os ingredientes da pizza: ");
        pizza.setIngredientes(scanner.nextLine());
        System.out.println("Digite o preço da pizza: ");
        pizza.setPreco(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Pizza cadastrada com sucesso!");
        return pizza;
    }
}
