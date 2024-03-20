import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            Calculadora.calculadora();
            System.out.println("Deseja fazer outra operação? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equals("n")) {
                break;
            }
        }

    }
}
