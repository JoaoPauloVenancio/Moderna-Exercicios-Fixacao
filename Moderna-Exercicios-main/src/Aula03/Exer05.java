package Aula03;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag1 = true;

        while (flag1) {
            System.out.println("Escreva seu nome");
            String nome = scan.nextLine();
            System.out.println("Quantas vezes ele deve ser exibido no console?");
            int qtd = scan.nextInt();
            int flag2 = 0;
            while (flag2 < qtd) {
                System.out.println(nome);
                flag2++;
            }
            flag1 = false;
        }
    }
}
