package Aula02;

import java.util.Scanner;

public class Exer14b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num1 = scan.nextInt();
        System.out.println("Digite um numero");
        int num2 = scan.nextInt();
        System.out.println("Digite um numero");
        int num3 = scan.nextInt();
        System.out.println("Digite um numero");
        int num4 = scan.nextInt();
        System.out.println("Digite um numero");
        int num5 = scan.nextInt();

        int maior = num1;
        int menor = num1;

        if (num2 > maior) {
            maior = num2;
        } else if (num2 < menor) {
            menor = num2;
        }

        if (num3 > maior) {
            maior = num3;
        } else if (num3 < menor) {
            menor = num3;
        }

        if (num4 > maior) {
            maior = num4;
        } else if (num4 < menor) {
            menor = num4;
        }

        if (num5 > maior) {
            maior = num5;
        } else if (num5 < menor) {
            menor = num5;
        }

        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
    }
}
