public final class ProdutoNormal extends Produto implements CalculoProdutoNormal{


    public ProdutoNormal(String nome, double valor, long quantidade) {
        super(nome, valor, quantidade);
    }

    public ProdutoNormal() {
    }

    @Override
    public double calcularDescontoNormal() {
        if (this.quantidade > 5){
            this.desconto = this.valor * 0.3;
            this.valor -= this.desconto;
            return this.valor;
        }
        return 0;
    }



    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
