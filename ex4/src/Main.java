import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Gostaria de cadastrar um personagem? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equals("s")) {
                Jogador.Cadastrar();
            } else {
                break;
            }
        }
        System.out.println("Gostaria de atualizar o personagem? (s/n)");
        String resposta = scanner.nextLine();
        if (resposta.equals("s")) {
            while (resposta.equals("s")) {
                System.out.println("Digite o nome do personagem que deseja atualizar: ");
                String nome = scanner.nextLine();
                Jogador personagem = Jogador.buscarJogador(nome);
                if (personagem != null) {
                    System.out.println("Personagem encontrado! Nome: " + personagem.getNome() + " Nivel: "
                            + personagem.getNivel() + " Pontos: " + personagem.getPontos());
                    while (true) {
                        System.out.println("Gostaria de atualizar o nivel ou os pontos? [1] Nivel [2] Pontos");
                        int opcao = scanner.nextInt();
                        scanner.nextLine();
                        if (opcao == 1) {
                            System.out.println("Digite o novo nivel: ");
                            personagem.setNivel(scanner.nextInt());
                            scanner.nextLine();
                        } else if (opcao == 2) {
                            System.out.println("Digite os novos pontos: ");
                            personagem.setPontos(scanner.nextInt());
                            scanner.nextLine();
                        }
                        System.out.println("Personagem atualizado com sucesso!");
                        System.out.println("Gostaria de atualizar mais alguma coisa? (s/n)");
                        resposta = scanner.nextLine();
                        if (resposta.equals("n")) {
                            break;
                        }
                    }
                } else {
                    System.out.println("Personagem não encontrado!");
                }
                System.out.println("Gostaria de atualizar outro personagem? (s/n)");
                resposta = scanner.nextLine();
            }
        }
        System.out.println("Personagens cadastrados: ");
        for (Jogador personagem : Jogador.personagens) {
            System.out.println("Nome: " + personagem.getNome() + " Nivel: " + personagem.getNivel() + " Pontos: " + personagem.getPontos());
        }
    }
}