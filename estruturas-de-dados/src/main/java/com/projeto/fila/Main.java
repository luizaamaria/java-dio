package com.projeto.fila;

public class Main {

    public static void main(String[] args) {
        //instanciando a Fila
        Fila<String> minhaFila = new Fila<>();

        // enfileirar o novo nó
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("ultimo");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);

    }
}
