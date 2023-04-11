package sobrecarga;
/*Cria uma aplicação que calcule a área dos 3 quadriláteros notávies: quadrado, retângulo e trapézio.
*
* Obs: User sobrecarga.1*/
public class Quadrilateros {

    public static void area(double lado) { //uma assinatura e um parametro
        System.out.println("área do quadrado: " + lado * lado);

    }

    public static void area(double lado1, double lado2) {//uma assinatura e dois parametros
        System.out.println("área do retângulo: " + lado1 * lado1);

    }

    public static void area(double baseMaior, double baseMenor, double altura) {//uma assinatura e três parametros
        System.out.println("área do trapézio: " + ((baseMaior+baseMenor)*altura) / 2);

    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Área do losango: " + (diagonal1 * diagonal2) / 2);
    }
}

// mantenha-se o nome do método e altera a lista de parametros = sobrecarga
// e se houver dois parametros de tipos iguais na mesma quantidade, ele acusará erro, neste caso precisa mudar o tipo