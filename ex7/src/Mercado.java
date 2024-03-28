import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mercado extends Produto {

    public Mercado() {
        super();
    }

    Scanner scanner = new Scanner(System.in);
    private List<Produto> produtos = new ArrayList<Produto>();

    public boolean Menu() {
        System.out.println("O que deseja fazer? ");
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Remover produto");
        System.out.println("3 - Atualizar produto");
        System.out.println("4 - Listar produtos");
        System.out.println("5 - Sair");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
            case 1:
                AdicionarProduto();
                break;
            case 2:
                RemoverProduto();
                break;
            case 3:
                AtualizarProduto();
                break;
            case 4:
                ListarProdutos();
                break;
            case 5:
                return false;
            default:
                System.out.println("Opção inválida!");
        }
        return true;
    }

    private void AdicionarProduto() {
        Produto produto = new Produto();
        System.out.println("Qual produto deseja adicionar? ");
        produto.setNome(scanner.nextLine());
        System.out.println("Qual o preço do produto? ");
        produto.setPreco(scanner.nextDouble());
        System.out.println("Qual a quantidade do produto? ");
        produto.setQuantidade(scanner.nextInt());
        scanner.nextLine();
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    private void RemoverProduto() {
        System.out.println("Qual o código do produto que deseja remover? ");
        String codigo = scanner.nextLine();
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo().equals(codigo)) {
                produtos.remove(produtos.get(i));
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    private void AtualizarProduto() {
        System.out.println("Qual o código do produto que deseja atualizar? ");
        String codigo = scanner.nextLine();
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                System.out.println("Produto: " + produto.getNome());
                System.out.println("Quantidade: " + produto.getQuantidade());
                System.out.println("Preço: " + produto.getPreco());
                Boolean continuar = true;
                while (continuar) {
                    System.out.println("O que deseja atualizar? ");
                    System.out.println("1 - Nome");
                    System.out.println("2 - Quantidade");
                    System.out.println("3 - Preço");
                    int opcao = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcao) {
                        case 1:
                            System.out.println("Qual o novo nome? ");
                            produto.setNome(scanner.nextLine());
                            break;
                        case 2:
                            System.out.println("Qual a nova quantidade? ");
                            produto.setQuantidade(scanner.nextInt());
                            scanner.nextLine();
                            break;
                        case 3:
                            System.out.println("Qual o novo preço? ");
                            produto.setPreco(scanner.nextDouble());
                            scanner.nextLine();
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    System.out.println("Deseja atualizar mais alguma coisa? (s/n)");
                    String resposta = scanner.nextLine();
                    if (resposta.equals("n")) {
                        continuar = false;
                    }
                }

            }
        }
    }

    private void ListarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Preço total: " + produto.getPreco() * produto.getQuantidade());
            System.out.println("-------------------------------");
        }
    }

}
