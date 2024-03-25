import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogador {

    private String nome;
    private int nivel;
    private int pontos;

    static List<Jogador> personagens = new ArrayList<>();

    public Jogador(String nome) {
        this.nome = nome;
        this.nivel = 1;
        this.pontos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel <= 1) {
            System.out.println("Nivel não pode ser menor ou igual a 1");
        } else if (nivel < this.nivel) {
            System.out.println("Nivel não pode ser diminuido");
        } else {
            this.nivel = nivel;
        }
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        if (pontos < 0) {
            System.out.println("Pontos não podem ser negativos");
        } else if (pontos < this.pontos) {
            System.out.println("Pontos não podem ser diminuidos");
        } else {
            this.pontos = pontos;
        }
    }

    public static Jogador buscarJogador(String nome2) {
        for (Jogador personagem : personagens) {
            if (personagem.getNome().equals(nome2)) {
                return personagem;
            }
        }
        return null;
    }

    public static void Cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do personagem: ");
        String nome = scanner.nextLine();
        Jogador personagem = buscarJogador(nome);
        if(nome.equals("")){
            System.out.println("Nome não pode ser vazio");
        } else if (personagem != null) {
            System.out.println("Personagem já cadastrado!");
        } else {
            personagem = new Jogador(nome);
            System.out.println("Nivel do personagem: ");
            personagem.setNivel(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Pontos do personagem: ");
            personagem.setPontos(scanner.nextInt());
            scanner.nextLine();
            personagens.add(personagem);
            System.out.println("Personagem cadastrado com sucesso!");
        }
    }

}
