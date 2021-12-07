package Aula02;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");

        System.out.println("Digite sua idade");
        int idade = scan.nextInt();

        if (idade < 16){
            System.out.println("voto proibido");
        } else if (idade >= 16 && idade < 18 || idade >= 70) {
            System.out.println("Voto facultativo");
        } else {
            System.out.println("Voto obrigatorio");
        }
    }
}
