package Aula02;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");
        System.out.println("Em que turno você estuda?");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");
        String num = scan.nextLine();
        switch (num) {
            case "m":
            case "M":
                System.out.println("Bom dia");
                break;
            case "v":
            case "V":
                System.out.println("Boa tarde");
                break;
            case "n":
            case "N":
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Valor invalido");
        }
    }
}
