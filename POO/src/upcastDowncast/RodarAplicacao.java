package upcastDowncast;

public class RodarAplicacao {
    public static void main(String[] args) {
        //instanciando um objeto da classe
        Funcionario funcionario = new Funcionario();

        //upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineira = new Faxineira();

//        downcast
//        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}
