package Aula02;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");
        System.out.println("Digite seu nome");
        String nome = scan.nextLine();
        System.out.println("Digite sua idade");
        String idade = scan.nextLine();
        System.out.println("Digite seu cpf");
        String cpf = scan.nextLine();
        System.out.println("Digite seu genero");
        String genero = scan.nextLine();
        System.out.println("Digite seu email");
        String email = scan.nextLine();
        System.out.println("Digite seu telefone");
        String telefone = scan.nextLine();
        System.out.println("Digite sua rua");
        String rua = scan.nextLine();
        System.out.println("Digite seu numero");
        String numero = scan.nextLine();
        System.out.println("Digite seu bairro");
        String bairro = scan.nextLine();
        System.out.println("Digite sua cidade");
        String cidade = scan.nextLine();


        System.out.println("########################################");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Genero: " + genero);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("----------------Endereço----------------");
        System.out.println("Rua: " + rua);
        System.out.println("Nº " + numero);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        System.out.println("########################################");
    }
}
