import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda extends Contatos{
 
    private List<Contatos> contatos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Agenda() {
        super(); // Call the superclass constructor
    }

    public void adicionarContato() {
        Contatos contato = new Contatos();
        System.out.println("Digite o nome do contato: ");
        contato.setNome(scanner.nextLine());
        System.out.println("Digite o telefone do contato: ");
        contato.setTelefone(scanner.nextLine());
        contatos.add(contato);
    }

    public void listarContatos() {
        for (Contatos contato : contatos) {
            System.out.println("Nome: " + contato.getNome() + " - Telefone: " + contato.getTelefone());
        }
    }

    public void removerContato() {
        System.out.println("Digite o nome do contato que deseja remover: ");
        String nome = scanner.nextLine();
        for (Contatos contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contatos.remove(contato);
                break;
            }else{
                System.out.println("Contato não encontrado");}
        }
    }

    public void buscarContato() {
        System.out.println("Digite o nome do contato que deseja buscar: ");
        String nome = scanner.nextLine();
        for (Contatos contato : contatos) {
            if (contato.getNome().equals(nome)) {
                System.out.println("Nome: " + contato.getNome() + " - Telefone: " + contato.getTelefone());
                break;
            }else{
                System.out.println("Contato não encontrado");}
        }
    }

    public boolean menu() {
        
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Listar contatos");
        System.out.println("3 - Remover contato");
        System.out.println("4 - Buscar contato");
        System.out.println("5 - Sair");
        System.out.println("Digite a opção desejada: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
            case 1:
                adicionarContato();
                break;
            case 2:
                listarContatos();
                break;
            case 3:
                removerContato();
                break;
            case 4:
                buscarContato();
                break;
            case 5:
                return false;
            default:
                System.out.println("Opção inválida");
                break;
        }
        return true;
    }


    
}