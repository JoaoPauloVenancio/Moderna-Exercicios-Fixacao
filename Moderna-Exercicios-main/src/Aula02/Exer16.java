package Aula02;

import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");

        System.out.println("Escolha uma opção");
        System.out.println("(1) - Cadastrar aluno");
        System.out.println("(2) - Cadastrar endereço");
        System.out.println("(3) - Imprimir aluno");
        System.out.println("(4) - Imprimir endereço");
        System.out.println("(5) - Sair");
        int escolha = scan.nextInt();
        scan.nextLine();
        switch (escolha) {
            case 1:
                System.out.println("Cadastrando aluno...");
                break;
            case 2:
                System.out.println("Cadastrando endereço...");
                break;
            case 3:
                System.out.println("Imprimindo aluno...");
                break;
            case 4:
                System.out.println("Imprimindo endereço...");
                break;
            case 5:
                System.out.println("saindo...");
                break;
            default:
                break;
        }
    }
}
