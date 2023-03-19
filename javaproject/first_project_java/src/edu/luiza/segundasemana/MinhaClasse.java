package edu.luiza.segundasemana;
public class MinhaClasse { //essa classe envolve todo o código
//método principal main || void não irá retornar nada apenas executar
    public static void main (String [] args) { //parametro do tipo string, detrmina o parametro como array e dentro de desse método {} terá um corpo
       //dessa /forma a variavel não pode ser alterada
        //final String BR = "Brasil";
        String primeiroNome = "Luiza";
        String segundoNome = "Maria";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    
    } 

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

    }

}
