package loops;

/*
Faça um programa que leia conjunto de dois valores, o primeiro representando o nome do aluno
e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class EX1_NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //método de entrada, aqui é possivel ler atraves do teclado
        // criando as variaveis de nome e idade
        String nome;
        int idade;

        while(true) {
            System.out.println("Nome:");
            nome = scan.next(); // método next retorna uma string, e esssa string eu vou atribuir a variavel nome
            if (nome.equals("0")) break;

            System.out.println("Idade:");
            idade = scan.nextInt(); // método nextInt pois a idade é um inteiro
        }

        System.out.println("Continua aqui...");

    }
}
