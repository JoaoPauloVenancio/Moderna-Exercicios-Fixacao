package Aula03;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean teste = true;
        while (teste) {
            System.out.println("Digite seu nome");
            String nome = scan.nextLine();

            if (nome.length() < 3) {
                System.out.println("O nome precisa ter no mínimo 3 letras");
            } else {
                teste = false;
            }
        }

        teste = true;
        while (teste) {
            System.out.println("Digite sua idade");
            int idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                teste = false;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150");
            }
        }

        teste = true;
        while (teste) {
            System.out.println("Digite seu salário");
            int salario = scan.nextInt();
            scan.nextLine();

            if (salario > 0) {
                teste = false;
            } else {
                System.out.println("Salário precisa ser maior que zero");
            }
        }

        teste = true;
        while (teste) {
            System.out.println("Digite seu sexo");
            String sexo = scan.nextLine();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                teste = false;
            } else {
                System.out.println("Sexo precisar ser F (feminino) ou M (masculino)");
            }
        }

        teste = true;
        while (teste) {
            System.out.println("Digite seu estado civil");
            String estado = scan.nextLine();


            if (estado.equalsIgnoreCase("s") || estado.equalsIgnoreCase("c")
            || estado.equalsIgnoreCase("v") || estado.equalsIgnoreCase("d") ) {
                teste = false;
            } else {
                System.out.println("Digite 's','c','v' ou 'd'");
            }
        }

    }
}

//explicar escopo de variaveis
