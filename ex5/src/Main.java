import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Gostaria de cadastrar um carro? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equals("s")) {
                Carro.Cadastrar();
            } else {
                break;
            }
        }
        while (true) {
            System.out.println("Gostaria de mover um carro? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equals("s")) {
                System.out.println("Gostaria de acelerar ou frear? \n [1] - Acelerar \n [2] - Frear");
                int escolha = scanner.nextInt();
                scanner.nextLine();
                switch (escolha) {
                    case 1:
                        Carro.Vroom();
                        break;

                    case 2:
                        Carro.Skrr();
                        break;

                    default:
                        break;
                }
            }
            else {
                break;
            }

        }
        
        while(true){
            System.out.println("Gostaria de buscar a informação de um carro? (s/n)");
            String resposta = scanner.nextLine();
            if(resposta.equals("s")){
                Carro.Info();
            }
            else{
                break;
            }
        }
        
        System.out.println("Gostaria de listar todos os carros cadastrados? (s/n)");
        String resposta = scanner.nextLine();
        if(resposta.equals("s")){
            Carro.Listar();
        }
        
    }
}