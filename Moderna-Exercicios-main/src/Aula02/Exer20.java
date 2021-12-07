package Aula02;

import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 0;

        // 1- para sim
        // 0 - para não

        System.out.println("Telefonou para a vitima?");
        int resp1 = scan.nextInt();
        if  (resp1 == 1){
            contador++;
        }

        System.out.println("Esteve no local do crime?");
        int resp2 = scan.nextInt();
        if  (resp2 == 1){
            contador++;
        }

        System.out.println("Mora perto da vítima?");
        int resp3 = scan.nextInt();
        if  (resp3 == 1){
            contador++;
        }

        System.out.println("Devia para a vítima?");
        int resp4 = scan.nextInt();
        if  (resp4 == 1){
            contador++;
        }

        System.out.println("Ja trabalhou com a vítima?");
        int resp5 = scan.nextInt();
        if  (resp5 == 1){
            contador++;
        }

        switch (contador){
            case 0:
            case 1:
                System.out.println("Inocente");
                break;
            case 2:
                System.out.println("Suspeito");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("saindo....");
        }
        // 2 = suspeito
        // 3 e 4 = cumplice
        // 5 = assassino
    }
}
