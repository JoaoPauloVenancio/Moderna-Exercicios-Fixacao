package Aula03;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite um numero");
            int num = scan.nextInt();
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("O maior numero foi: " + maior);
    }
}
