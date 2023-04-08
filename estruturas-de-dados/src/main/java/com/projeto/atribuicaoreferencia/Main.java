package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        // com tipos primitivos o java não copia a referencia e sim o valor

        System.out.println("intA = " + intA + " intB = " + intB);
        intA = 2;
        System.out.println("intA = " + intA + " intB = " + intB);

        MeuObjt objtA = new MeuObjt(1);
        MeuObjt objtB = objtA;

        // e com objetos ele está copiando a referencia de memória do objtA e atribuindo ao objtB ou seja, estão apontando
        // para o mesmo endereço de memória

        System.out.println("objtA = " + objtA + " objtB = " + objtB);
        objtA.setNum(2); // por isso que quando é setado o objtA com 2, e o objB é igual o objtA
        // ambos estão com o mesmo valor (2), pois eles estão apontando pro mesmo endereço
        System.out.println("objtA = " + objtA + " objtB = " + objtB);

    }
}
