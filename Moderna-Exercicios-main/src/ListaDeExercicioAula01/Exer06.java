package ListaDeExercicioAula01;

public class Exer06 {
    public static void main(String[] args) {
        String a = "Colher";
        String b = "Garfo";
        String c;

        c = b;
        b = a;
        a = c;

        System.out.println("Agora o valor de a é: " + a);
        System.out.println("E o valor de b é de : " + b);

    }
}
