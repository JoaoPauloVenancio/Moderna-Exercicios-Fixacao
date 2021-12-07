package Aula03;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");
        boolean flag = true;
        String nome, sexo, rua, numero, bairro, cep, idade, anoNascimento;
        nome = sexo = rua = numero = bairro = cep = idade = anoNascimento = "";


        while (flag) {
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
                    System.out.println("Digite o nome do aluno");
                    nome = scan.nextLine();
                    System.out.println("Digite a idade do aluno");
                    idade = scan.nextLine();
                    System.out.println("Digite o sexo do aluno");
                    sexo = scan.nextLine();
                    System.out.println("Digite o ano de nascimento do aluno");
                    anoNascimento = scan.nextLine();
                    ;
                    break;
                case 2:
                    System.out.println("Digite a rua");
                    rua = scan.nextLine();
                    System.out.println("Digite a numero");
                    numero = scan.nextLine();
                    System.out.println("Digite a bairro");
                    bairro = scan.nextLine();
                    System.out.println("Digite a cep");
                    cep = scan.nextLine();
                    break;
                case 3:
                    System.out.println("--------- dados do aluno ----------");
                    System.out.println("Nome: " + nome);
                    System.out.println("idade: " + idade);
                    System.out.println("sexo: " + sexo);
                    System.out.println("Ano de nascimento: " + anoNascimento);
                    System.out.println("-----------------------------------");
                    break;
                case 4:
                    System.out.println("--------- dados do endereço ----------");
                    System.out.println("Rua: " + rua);
                    System.out.println("Número: " + numero);
                    System.out.println("Bairro: " + bairro);
                    System.out.println("CEP: " + cep);
                    System.out.println("--------------------------------------");
                    break;
                case 5:
                    System.out.println("saindo...");
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
}
