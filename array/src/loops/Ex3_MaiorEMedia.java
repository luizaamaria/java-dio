package loops;

import java.util.Scanner;
import java.util.Set;

/*
* Faça um programa que leia 5 números
* e informe o maior número
* e a média desses números
* */
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma =  0;

        //criando uma variavel de contador que ela vai aumentando em 1 unidade desde que complete esse laço
        int count = 0;


        //repetir 5 vezes a pergunta
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

    }
}
