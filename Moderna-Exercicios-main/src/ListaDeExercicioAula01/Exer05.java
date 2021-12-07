package ListaDeExercicioAula01;

public class Exer05 {
    public static void main(String[] args) {
        String nome = "Sergio";
        double salario = 3500;
        double totVendas = 1350;
        double comissao = (salario*20)/100;
        double salarioComissao = salario + comissao;


        System.out.println("O nome do trabalhador é: " + nome);
        System.out.println("O salario de " + nome + " é " + salario);
        System.out.println(nome + " ganhou " + comissao + " de comissão");
        System.out.println("O valor final do salario é de: " + salarioComissao);
    }
}
