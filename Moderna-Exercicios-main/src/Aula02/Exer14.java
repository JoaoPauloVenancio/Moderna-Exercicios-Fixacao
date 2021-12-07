package Aula02;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        System.out.println("Digite o primeiro numero");
        int num1 = scan.nextInt();
        if (num1 > maior) {
            maior = num1;
        }
        System.out.println("Digite o segundo numero");
        int num2 = scan.nextInt();
        if (num2 > maior) {
            maior = num2;
        }
        System.out.println("Digite o terceiro numero");
        int num3 = scan.nextInt();
        if (num3 > maior) {
            maior = num3;
        }
        System.out.println("Digite o quarto numero");
        int num4 = scan.nextInt();
        if (num4 > maior) {
            maior = num4;
        }
        System.out.println("Digite o quinto numero");
        int num5 = scan.nextInt();
        if (num5 > maior) {
            maior = num5;
        }
        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
            menor = num1;
        } else if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
            menor = num2;
        } else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
            menor = num3;
        } else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
            menor = num4;
        } else {
            menor = num5;
        }

        System.out.println("maior numero: " + maior);
        System.out.println("menor numero: " + menor);
    }
}
