package Aula02;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");

        System.out.println("Digite o valor do seu saldo");
        int num1 = scan.nextInt();

        if (num1 < 0){
            System.out.println("Saldo negativo");
        } else {
            System.out.println("Saldo positivo");
        }
    }
}
