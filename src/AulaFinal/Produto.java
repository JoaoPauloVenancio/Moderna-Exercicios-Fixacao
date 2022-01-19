package AulaFinal;

public abstract class Produto {
    protected String nome;
    protected double valor;
    protected long quantidade;
    protected double desconto;
    protected double valorTotalDoProduto;

    public Produto(String nome, double valor, long quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Produto() {
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", valorTotalDoProduto=" + valorTotalDoProduto +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTotalDoProduto() {
        return valorTotalDoProduto;
    }

    public void setValorTotalDoProduto(double valorTotalDoProduto) {
        this.valorTotalDoProduto = valorTotalDoProduto;
    }
}
