package Aula02;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");
        System.out.println("Digite um numero");
        int num1 = scan.nextInt();
        System.out.println("Digite outro numero");
        int num2 = scan.nextInt();

        int soma = num1 + num2;
        int multiplicacao = num1 * num2;

        System.out.println("A soma dos numeros é: " + soma);
        System.out.println("A multiplicação dos numeros é: " + multiplicacao);
        if (soma == multiplicacao){
            System.out.println("O resultado da soma somado a multiplicação é igual");
        } else {
            System.out.println("O resultado é diferente");
        }


    }
}
