package Aula02;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");

        System.out.println("Digite uma letra");
        String letra = scan.nextLine();

        if (letra.equalsIgnoreCase("f")) {
            System.out.println("F - Feminino");
        } else if (letra.equalsIgnoreCase("m")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}

//    Character letra = scan.next().charAt(0);
//if (letra.equals('f') || letra.equals('F')) {
//        System.out.println("F - Feminino");
//        } else if (letra.equals('m') || letra.equals('M')) {
//        System.out.println("M - Masculino");
//        } else {
//        System.out.println("Letra invalida");
//        }