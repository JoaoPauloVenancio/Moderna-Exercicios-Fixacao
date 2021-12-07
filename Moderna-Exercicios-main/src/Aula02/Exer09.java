package Aula02;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");

        System.out.println("Digite o 1º numero");
        int num1 = scan.nextInt();
        System.out.println("Digite o 2º numero");
        int num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println("O maior número é: " + num1 + " e o menor é: "+ num2);
        } else {
            System.out.println("O maior número é: "+ num2+ " e o menor é: " + num1);
        }
    }
}
