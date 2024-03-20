import java.util.Scanner;

public class Calculadora {
    
    public static void operacao(String operacao, float num1, float num2){
        switch (operacao){
            case "+":
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case "/":
                if (num1 == 0 || num2 == 0) {
                    System.out.println("Não é possível dividir por zero");
                    break;
                }
                System.out.println("Resultado: " + (num1 / num2));
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
    
    public static void calculadora(){
        Scanner scanner = new Scanner(System.in);
        float num1, num2;
        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextFloat();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextFloat();
        System.out.println("Digite a operação desejada (+, -, *, /): ");
        String operacao = scanner.next();
        operacao(operacao, num1, num2);

    }
}
