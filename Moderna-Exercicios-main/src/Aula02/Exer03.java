package Aula02;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");

        System.out.println("Digite um numero");
        int num1 = scan.nextInt();
        System.out.println("Digite outro numero");
        int num2 = scan.nextInt();

        System.out.println("A soma dos numeros "+ num1 + " e " + num2 + " é: " + (num1+num2));
    }
}
