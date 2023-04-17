package estruta_basica;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro(); // criando um objeto chamado carro1 do tipo da class Carro e chamando o construtor defalut (sem nenhum parametro)

        //chamando o metódo set

        carro1.setCor("preto");
        carro1.setModelo("bmw");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.30));//chamando o método totalValorTanque

        //aqui foi criado um objeto sem ser vazio, utilizando a sobrecarga do construtor
        Carro carro2 = new Carro("cinza", "mercedes", 66);
        //como já foi passado os valores, não tem necessidade de fazer os set passando os valores
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.39));//chamando o método totalValorTanque
    }
}
