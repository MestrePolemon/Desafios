public class Produto {
    
    private String nome;
    private double preco;
    private int quantidade;
    private String codigo;
    private static int proximoCodigo = 0;

    public Produto() {
        this.nome = null;
        this.preco = 0;
        this.quantidade = 0;
        this.codigo = String.format("%05d", proximoCodigo++);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    

}
