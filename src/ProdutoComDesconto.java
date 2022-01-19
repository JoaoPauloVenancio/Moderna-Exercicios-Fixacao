public final class ProdutoComDesconto extends Produto implements CalculoProdutoComDesconto {
    private boolean pagamentoComCartao;
    private static double descontoAdicional = 0.1;

    @Override
    public double calcularDesconto(boolean valor) {
        this.pagamentoComCartao = valor;
        if (this.pagamentoComCartao == false) {
            this.desconto = this.valor * 0.5;
            this.valor -= this.desconto;
            return this.valor;
        }
        this.desconto = this.valor * this.descontoAdicional;
        this.valor -= this.desconto;
        return this.valor;
    }

    public boolean isPagamentoComCartao() {
        return pagamentoComCartao;
    }

    public void setPagamentoComCartao(boolean pagamentoComCartao) {
        this.pagamentoComCartao = pagamentoComCartao;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}


