package loops;

import java.util.Scanner;

/* Faça um programa que peça uma nota, entre zero e dez.
 Mostre uma mensagem caso o valor seja inválido
 e continue pedindo até que o usuário informe um valor válido.
 */
public class EX2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        // só irá entrar no while quando a nota for menor que 0 ou maior que 0
        while(nota < 0 | nota > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
