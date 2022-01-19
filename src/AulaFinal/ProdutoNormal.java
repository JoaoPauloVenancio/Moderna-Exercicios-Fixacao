package AulaFinal;

public final class ProdutoNormal extends Produto implements CalculoProdutoNormal{


    @Override
    public double calcularDescontoNormal() {
        if (this.quantidade > 5){
            this.valorTotalDoProduto = this.valor * this.quantidade;
            this.desconto = this.valorTotalDoProduto * 0.3;
            this.valorTotalDoProduto -= this.desconto;
            return this.valor;
        }
        return 0;
    }
}
