package ListaDeExercicioAula01;

public class Exer08 {
    public static void main(String[] args) {
        double valorDepositado = 500;
        double juros = (valorDepositado * 0.70) / 100;
        double valorFinal = valorDepositado + juros;

        System.out.println("O valor depositado foi R$" + valorDepositado + " reais");
        System.out.println("Rendendo R$" + juros + " reais de juros");
        System.out.println("Conseguiu juntar R$" + valorFinal);
    }
}
