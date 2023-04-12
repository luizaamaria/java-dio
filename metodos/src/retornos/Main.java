package retornos;

/*Recrie a aplicação que calcula a área dos 3 quadriláteros notáveis. Agora faça os métodos retornarem valores*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio quadrilatero");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("área dp trapézio: " + areaTrapezio);
    }
}
