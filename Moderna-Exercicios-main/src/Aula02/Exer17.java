package Aula02;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");
        System.out.println("Digite uma letra");
        String num = scan.nextLine();
        switch (num) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(num + " é vogal");
                break;
            default:
                System.out.println(num + " é consoante");
        }
    }
}
