package Aula03;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean teste = true;

        while (teste) {
            System.out.println("Digite uma nota");
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota válida");
                teste = false;
            } else {
                System.out.println("Nota inválida");
            }
        }
    }
}
