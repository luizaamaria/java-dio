package array;

import java.util.Random;

/* faça um programa que leia 2o números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
 */
public class EX3_NUmerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random(); //classe para gerar números aleatórios

        int[] numerosAleatorios = new int[20];//array com 20 posições

        //para: variável i = numero, até i menor que o tamanho do array, acrescentamos 1 ao valor de i a cada loop.
        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100); //pegando um número aleatório entre 0 e 100.
            numerosAleatorios[i] = numero;//atribuindo esse valor ao elemento na respectiva posição do array numeros.
        }

        System.out.println("\nNumeros aleatorios: ");
        //loop for-each
        for (int numero : numerosAleatorios) {//para cada numero dentro do array de números
            System.out.println(numero + " "); //imprima o número
        }

        System.out.print("\nSucessores dos numeros aleatórios: ");
        for (int numero : numerosAleatorios) { //para cada numero dentro do array de números
            System.out.println((numero + 1) + " "); //adicione o valor 1 ao número e imprima esse novo valor
        }

        System.out.print("\nAntecessor dos numeros aleatórios: ");
        for (int numero : numerosAleatorios) { //para cada numero dentro do array de números
            System.out.println((numero - 1) + " "); //subtrai o valor 1 ao número e imprima esse novo valor
        }
    }
}
