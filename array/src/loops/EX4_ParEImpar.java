package loops;

import java.util.Scanner;

/*Faça um programa que peça N numeros inteiros,
calcule e mostre a quantidade de números pares e
a quantidade de números impares.*/
public class EX4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //declarar variaveis

        int qntNumeros = 0;
        int numero;
        int pares = 0, impares = 0;

        System.out.println("Quantidade de números: ");
        qntNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) pares++;
            else impares++;

            count++; // incrementando o contador pra controlar a quantidade de vezes que o laço vai rodar, se não o loop fica infinito
        }while (count < qntNumeros); // o contador tem que ser menor do que a quantidade de números indicadas

        System.out.println("Quantidade Par: " + pares);
        System.out.println("Quantidade Impar: " + impares);

    }
}
