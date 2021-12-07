package Aula02;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int num1 = scan.nextInt();

        System.out.println("Digite um outro inteiro");
        int num2 = scan.nextInt();

        System.out.println("Digite um numero real");
        double num3 = scan.nextDouble();


        int dobro = num1*2;
        int triplo = num1*3;
        int metade = num2/2;
        double potencia = Math.pow(num3, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + dobro*metade);
        System.out.println("A soma do triplo do primeiro com o terceiro " + (triplo+num3));
        System.out.println("O terceiro numero elevado ao cubo é: " + potencia);
    }
}
