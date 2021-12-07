package Aula02;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");

        System.out.println("Digite uma letra");
        String letra = scan.nextLine();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
        || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println(letra + " é uma vogal");
        } else {
            System.out.println(letra + " é uma consoante");
        }
    }
}
