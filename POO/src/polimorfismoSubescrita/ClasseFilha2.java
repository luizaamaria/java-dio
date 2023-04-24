package polimorfismoSubescrita;

class ClasseFilha2 extends ClasseMae {

    @Override
    void metodo1() { //metodo1 foi sobescrito
        System.out.println("Método 1 da classe filha 2");
    }

    @Override
    void metodo2() {
        System.out.println("método 2 da classe filha 2");
    }

}
