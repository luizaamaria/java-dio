package array;

import java.util.Random;

/*
Gere e imprima uma matriz M 4X4 com valores aleatórios entre 0-9
 */
public class EX4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();//classe para gerar números aleatórios

        int[][] M = new int[4][4];//declaração de uma matriz multidimensional

        //para: variável i = 0, até i menor que o tamanho da matriz (array multidimencional), acrescentamos 1 ao valor de i a cada loop.
        for (int i = 0; i < M.length; i++) { //navegando na matriz
            //para: variável j = 0, até i menor que o tamanho da linha, acrescentamos 1 ao valor de i a cada loop.
            for(int j = 0; j < M[i].length; j++) { //navegando na linha (array unidimensional)
                M[i][j] = random.nextInt(9); //atribuindo um número aleatóriamente a posição do elemento

            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : M) { //para cada linha da matriz M
            for (int coluna : linha) { //pegue a coluna desta linha
                System.out.print(coluna + " ");//imprima esta coluna
            }
            System.out.println();//pular uma linha
        }
    }
}
