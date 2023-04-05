package loops;

import java.util.Scanner;

/* Desenvolva um gerador de tabuada,
 capas de gerar a tabuada de qualquer número entre 1 a 10.
 O usuário deve informar de qual numero ele deseja ver a tabuada.
 A saida deve ser conforme o exemplo abaixo:

 tabuada de 5:
 5 x 1 = 5
 */
public class Ex5_Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número da tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
