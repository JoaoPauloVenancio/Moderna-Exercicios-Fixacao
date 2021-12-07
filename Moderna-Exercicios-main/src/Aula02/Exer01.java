package Aula02;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");
        System.out.println("Digite o nome completo do seu pai");
        String nomePai = scan.nextLine();
        System.out.println("Digite a idade do seu pai");
        long idadePai = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite o nome completo da sua mãe");
        String nomeMae = scan.nextLine();
        System.out.println("Digite a idade do seu mãe");
        long idadeMae = scan.nextInt();


        System.out.println("Pai: " + nomePai + "- Idade: " + idadePai);
        System.out.println("Mãe: " + nomeMae + "- Idade: " + idadeMae);


    }
}
