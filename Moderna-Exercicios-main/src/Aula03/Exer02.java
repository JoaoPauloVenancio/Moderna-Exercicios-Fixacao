package Aula03;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean teste = true;

        while (teste) {
            System.out.println("Digite nome de usuário");
            String nome = scan.nextLine();

            System.out.println("Digite sua senha");
            String senha = scan.nextLine();

            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("Usuario nao pode ser igual a senha! Digite novamente");
            } else {
                System.out.println("Obrigado!");
                teste = false;
            }
        }
    }
}
