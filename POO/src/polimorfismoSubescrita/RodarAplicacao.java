package polimorfismoSubescrita;

public class RodarAplicacao {
    public static void main(String[] args) {

        //vetor do tipo ClasseMae classe que contem 3 objetos
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //percorreu os 3 objetos e chamei o método1 de cada um deles
        //polimorfismo com sobescrita
        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        //apenas sobescrita
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
