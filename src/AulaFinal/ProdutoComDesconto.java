package AulaFinal;

public final class ProdutoComDesconto extends Produto implements CalculoProdutoComDesconto {

    @Override
    public double calcularDesconto(boolean valor) {
        this.valorTotalDoProduto = this.valor * this.quantidade;
        if (!valor) {
            this.desconto = this.valorTotalDoProduto * 0.5;
            this.valorTotalDoProduto -= this.desconto;
            return this.valor;
        }
        this.desconto = this.valorTotalDoProduto * 0.6;
        this.valorTotalDoProduto -= this.desconto;
        return this.valor;
    }
}


