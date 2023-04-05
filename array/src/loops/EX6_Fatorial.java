package loops;

import java.util.Scanner;

/* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
 ex: 5! = 120 (5 x4 x 3 x 2 x 1)*/
public class EX6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int mult = 1;

        System.out.println(fatorial +"! = ");
        //decremento pois conforme o laço rodar o número vai diminuindo ex: x 3 x 2 x 1
        for(int i = fatorial; i >= 1; i-- ) {
            mult = mult * i;

        }

        System.out.println(mult);
    }

}
