package array;
/*Crie um vetor de 6 números inteiros, e mostre-os na ordem inversa*/
public class EX1_OrdemInversa {
    public static void main(String[] args) {

        //tipo de elemento do array = 5 posições com 6 elementos
        int [] vetor = {-5, -6, 15, 50, 8, 4}; //vetor unidimensional

        System.out.println("Vetor: ");
        int count = 0;
//        length retorna o tamanho do vetor = vetor.lenght
//        while(count <= (vetor.length -1)) { // -1 porque o array começa na posição 0 e se chegar até a posição 6 dará um erro pois não tem essa posição
        while(count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }
    }
}
