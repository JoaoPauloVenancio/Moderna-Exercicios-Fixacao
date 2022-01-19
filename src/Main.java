import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println(" ######  Bem vindo ao mercado da moderna #######  ");
            System.out.println("|                                                |");
            System.out.println("|    Deseja comprar que tipo de produto?         |");
            System.out.println("|                                                |");
            System.out.println("|      Digite 1 ou 2 para escolher               |");
            System.out.println("|                                                |");
            System.out.println("|  1. Produtos normais                           |");
            System.out.println("|  2. Produtos em liquidação                     |");
            System.out.println("|                                                |");
            System.out.println("|________________________________________________|");
            int resposta = scan.nextInt();
            scan.nextLine();
            if (resposta > 2 || resposta < 1) {
                System.out.println("Digite novamente");
            } else if (resposta == 1) {
                ProdutoNormal produtoNormal = new ProdutoNormal();
                System.out.println("Digite o nome do produto que deseja adquirir");
                String nome = scan.nextLine();
                produtoNormal.setNome(nome);

                System.out.println("Digite o valor do produto que deseja adquirir");
                double valor = scan.nextDouble();
                produtoNormal.setValor(valor);

                System.out.println("Digite a quantidade de produtos que deseja adquirir");
                long qtd = scan.nextLong();
                produtoNormal.setQuantidade(qtd);
                produtoNormal.calcularDescontoNormal();
                System.out.println(produtoNormal);
                flag = false;

            } else {
                ProdutoComDesconto produtoComDesconto = new ProdutoComDesconto();
                System.out.println("Digite o nome do produto que deseja adquirir");
                String nome = scan.nextLine();
                produtoComDesconto.setNome(nome);

                System.out.println("Digite o valor do produto que deseja adquirir");
                double valor = scan.nextDouble();
                produtoComDesconto.setValor(valor);

                System.out.println("Digite a quantidade de produtos que deseja adquirir");
                long qtd = scan.nextLong();
                scan.nextLine();
                produtoComDesconto.setQuantidade(qtd);

                System.out.println("Pagamento vai ser no dinheiro ou cartao?");
                String verificacao = scan.nextLine();
                if (verificacao.equalsIgnoreCase("cartao")){
                    produtoComDesconto.calcularDesconto(false);
                } else {
                    produtoComDesconto.calcularDesconto(true);
                }
                System.out.println(produtoComDesconto);
                flag = false;

            }
        }
    }
}
