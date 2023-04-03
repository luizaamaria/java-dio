/*
Criar um simples projeto e criar variaveis e expressões para usar nas estruturas if e switch.

Com if, exiba o nome do mês do ano de acordo com seu numero.
Evite o efeito "flecha". Faça também outro if que verifique se o mês é julho,
dezembro ou janeiro, para assim exibir o texto "Férias"
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ifSemFlecha();

        switchSemana();

        switchNumero();

        switchFerias();
    }

    public static void ifSemFlecha() {
        int mes = 90;
        if (mes == 1) {
            System.out.println("O mês é Janeiro.");
        } else if (mes == 2) {
            System.out.println("O mês é Fevereiro.");
        } else if (mes == 3) {
            System.out.println("O mês é Março.");
        } else if (mes == 4) {
            System.out.println("O mês é Abril.");
        } else if (mes == 5) {
            System.out.println("O mês é Maio.");
        } else if (mes == 6) {
            System.out.println("O mês é Junho.");
        } else if (mes == 7) {
            System.out.println("O mês é Julho.");
        } else if (mes == 8) {
            System.out.println("O mês é Agosto.");
        } else if (mes == 9) {
            System.out.println("O mês é Setembro.");
        } else if (mes == 10) {
            System.out.println("O mês é Outubro.");
        } else if (mes == 11) {
            System.out.println("O mês é Novembro.");
        } else if (mes == 12) {
            System.out.println("O mês é Dezembro.");
        } else {
            System.out.println("mês indefinido");
        }

//        if (mes == 1) {
//            System.out.println("Férias!");
//        } else if (mes == 7) {
//            System.out.println("Férias!");
//        } else if (mes == 12) {
//            System.out.println("Férias!");
//        }
    }

    public static void switchSemana() {
        String dia = "ahabsbs";
        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("dia inválido");
                break;
        }

    }

    public static void switchNumero() {
        int numero = 4;
        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("valor inválido");
                break;
        }


    }

    public static void switchFerias() {
        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("mês inválido");
                break;
         }
    }
}







//import java.util.Scanner;
//public class Decisao {
//    public static void main(String[] args) {
//
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Digite o número correspondente ao mês: ");
//        int numero = entrada.nextInt();
//
//        if (numero == 1) {
//            System.out.println("O mês é Janeiro.");
//        } else if (numero == 2) {
//            System.out.println("O mês é Fevereiro.");
//        } else if (numero == 3) {
//            System.out.println("O mês é Março.");
//        } else if (numero == 4) {
//            System.out.println("O mês é Abril.");
//        } else if (numero == 5) {
//            System.out.println("O mês é Maio.");
//        } else if (numero == 6) {
//            System.out.println("O mês é Junho.");
//        } else if (numero == 7) {
//            System.out.println("O mês é Julho.");
//        } else if (numero == 8) {
//            System.out.println("O mês é Agosto.");
//        } else if (numero == 9) {
//            System.out.println("O mês é Setembro.");
//        } else if (numero == 10) {
//            System.out.println("O mês é Outubro.");
//        } else if (numero == 11) {
//            System.out.println("O mês é Novembro.");
//        } else if (numero == 12) {
//            System.out.println("O mês é Dezembro.");
//        }
//
//        if (numero == 1) {
//            System.out.println("Férias!");
//        } else if (numero == 7) {
//            System.out.println("Férias!");
//        } else if (numero == 12) {
//            System.out.println("Férias!");
//        }
//    }
//}




//import java.util.Scanner;
////Com Switch
//public class Decisao {
//    public static void main(String[] args) throws Exception {
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Digite o número correspondente ao mês: ");
//        int numero = entrada.nextInt();
//        switch (numero) {
//            case 1:
//                System.out.println("O mês é Janeiro.");
//                break;
//            case 2:
//                System.out.println("O mês é Fevereiro");
//                break;
//            case 3:
//                System.out.println("O mês é Março.");
//                break;
//            case 4:
//                System.out.println("O mês é Abril.");
//                break;
//            case 5:
//                System.out.println("O mês é Maio.");
//                break;
//            case 6:
//                System.out.println("O mês é Junho.");
//                break;
//            case 7:
//                System.out.println("O mês é Julho.");
//                break;
//            case 8:
//                System.out.println("O mês é Agosto.");
//                break;
//            case 9:
//                System.out.println("O mês é Setembro.");
//                break;
//            case 10:
//                System.out.println("O mês é Outubro.");
//                break;
//            case 11:
//                System.out.println("O mês é Novembro.");
//                break;
//            case 12:
//                System.out.println("O mês é Dezembro.");
//                break;
//            default:
//                System.out.println("Não existe um mês correspondente a esse número!");
//        }
//
//        if (numero == 1) {
//            System.out.println("Férias!");
//        } else if (numero == 7) {
//            System.out.println("Férias!");
//        } else if (numero == 12) {
//            System.out.println("Férias!");
//        }
//    }
//}
