import java.util.Scanner;

public class Main extends Biblioteca {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Biblioteca livro = new Biblioteca();
            System.out.println("Digite o título do livro: ");
            livro.setTitulo(scanner.nextLine());
            System.out.println("Digite o autor do livro: ");
            livro.setAutor(scanner.nextLine());
            System.out.println("Digite o ano do livro: ");
            livro.setAno(scanner.nextInt());
            scanner.nextLine();
            Biblioteca.livros.add(livro);
            System.out.println("Deseja cadastrar outro livro? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equals("n")) {
                break;
            }
        }

        Biblioteca.exibirInfo();
    }
}
