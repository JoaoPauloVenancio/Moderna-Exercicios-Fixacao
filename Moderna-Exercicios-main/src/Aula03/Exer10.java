package Aula03;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o numero para gerar a tabuada");
        int num = scan.nextInt();
        System.out.println("Tabuada de " + num);
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
