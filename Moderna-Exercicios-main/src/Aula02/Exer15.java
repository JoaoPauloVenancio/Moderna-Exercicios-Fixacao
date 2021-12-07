package Aula02;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");
        System.out.println("Digite um numero entre 1 e 12");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("1 - Janeiro");
                break;
            case 2:
                System.out.println("2 - Fevereiro");
                break;
            case 3:
                System.out.println("3 - Março");
                break;
            case 4:
                System.out.println("4 - Abril");
                break;
            case 5:
                System.out.println("5 - Maio");
                break;
            case 6:
                System.out.println("6 - Junho");
                break;
            case 7:
                System.out.println("7 - Julho");
                break;
            case 8:
                System.out.println("8 - Agosto");
                break;
            case 9:
                System.out.println("9 - Setembro");
                break;
            case 10:
                System.out.println("10 - Outubro");
                break;
            case 11:
                System.out.println("11 - Novembro");
                break;
            case 12:
                System.out.println("12 - Dezembro");
                break;
            default:
                System.out.println("Mês informado não existe");
        }
    }
}
