import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeMaxima;
    private int velocidadeAtual;

    static Scanner scanner = new Scanner(System.in);

    static List<Carro> carros = new ArrayList<>();

    public Carro() {
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
        this.placa = "";
        this.velocidadeMaxima = 0;
        velocidadeAtual = 0;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public String getPlacca() {
        return placa;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public static void Cadastrar() {
        Carro carro = new Carro();
        System.out.println("Digite a marca do carro: ");
        carro.setMarca(scanner.nextLine());
        System.out.println("Digite o modelo do carro: ");
        carro.setModelo(scanner.nextLine());
        System.out.println("Digite o ano do carro: ");
        carro.setAno(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Digite a placa do carro: ");
        carro.setPlaca(scanner.nextLine());
        System.out.println("Digite a velocidade máxima do carro: ");
        carro.setVelocidadeMaxima(scanner.nextInt());
        scanner.nextLine();
        carro.carros.add(carro);
        System.out.println("Carro cadastrado com sucesso!");
    }

    public static void Vroom() {
        System.out.println("Digite a placa do carro que deseja acelerar: ");
        String placa = scanner.nextLine();
        for (Carro carro : carros) {
            if (carro.getPlacca().equals(placa)) {
                System.out.println("Digite a velocidade que deseja acelerar: ");
                carro.velocidadeAtual += scanner.nextInt();
                scanner.nextLine();
                carro.setVelocidadeAtual(carro.velocidadeAtual);
                if (carro.velocidadeAtual > carro.getVelocidadeMaxima()) {
                    System.out.println("Velocidade maior que a máxima do carro");
                } else {
                    System.out.println("Carro acelerado com sucesso!");
                }
                return;
            }
        }
        System.out.println("Carro não encontrado");
    }

    public static void Info() {
        System.out.println("Digite a placa do carro que deseja puxar a informação: ");
        String placa = scanner.nextLine();
        for (Carro carro : carros) {
            if (carro.getPlacca().equals(placa)) {
                System.out.println("Marca: " + carro.getMarca());
                System.out.println("Modelo: " + carro.getModelo());
                System.out.println("Ano: " + carro.getAno());
                System.out.println("Placa: " + carro.getPlacca());
                System.out.println("Velocidade Máxima: " + carro.getVelocidadeMaxima());
                System.out.println("Velocidade Atual: " + carro.getVelocidadeAtual());
                return;
            }
        }
        System.out.println("Carro não encontrado");
    }

    public static void Skrr() {
        System.out.println("Digite a placa do carro que deseja frear: ");
        String placa = scanner.nextLine();
        for (Carro carro : carros) {
            if (carro.getPlacca().equals(placa)) {
                System.out.println("Digite a velocidade que deseja frear: ");
                carro.velocidadeAtual -= scanner.nextInt();
                scanner.nextLine();
                carro.setVelocidadeAtual(carro.velocidadeAtual);
                if (carro.velocidadeAtual < 0) {
                    System.out.println("O carro está parado");
                } else {
                    System.out.println("Carro freado com sucesso!");
                    return;
                }
            }
        }
        System.out.println("Carro não encontrado");
    }

    public static void Listar() {
        for (Carro carro : carros) {
            System.out.println("Marca: " + carro.getMarca());
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Ano: " + carro.getAno());
            System.out.println("Placa: " + carro.getPlacca());
            System.out.println("Velocidade Máxima: " + carro.getVelocidadeMaxima());
            System.out.println("Velocidade Atual: " + carro.getVelocidadeAtual());
            System.out.println("-------------------------------");
        }
    }

    
}