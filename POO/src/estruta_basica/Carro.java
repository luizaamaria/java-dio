package estruta_basica;

public class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    //construtor e uso de sobrecarga

    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor; // o atributo cor, recebe a cor como parâmetro;
        this.modelo = modelo; // o atributo modelo, recebe a modelo como parâmetro;
        this.capacidadeTanque = capacidadeTanque;// o atributo capacidadeTanque recebe a capacidade como parâmetro;
    }

    public String getCor() {
        return cor; // o retorno deve ser compativel com o tipo de dados que o método retorna, no caso String
    }

    //get e set cor
    public void setCor(String cor) {
        this.cor = cor;
    }

    // get e set modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //get e set tanque
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    //método do total para encher o tanque

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
