
import java.util.HashMap;


public class ContaBancaria {
    
    static HashMap<String,ContaBancaria> contas = new HashMap<>();
    private static int proximoNumeroConta = 1;
    private float saldo;
    private String titular;
    private String numeroConta;

    public ContaBancaria() {
        this.saldo = 0;
        this.titular = "";
        this.numeroConta = String.format("%05d", proximoNumeroConta++);
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void Depositar(float valor){
        this.saldo += valor;
    }

    public void Sacar(float valor){
        this.saldo -= valor;
    }
}
