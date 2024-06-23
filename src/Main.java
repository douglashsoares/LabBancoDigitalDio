public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Cliente jorge = new Cliente();
        jorge.setNome("Jorge Henrique");

        Cliente wesley = new Cliente();
        wesley.setNome("Wesley Ferreira");

        Cliente maria = new Cliente();
        maria.setNome("Maria Jose");

        Cliente giselda = new Cliente();
        giselda.setNome("Giselda Soares");

        Conta ccVenilton = new ContaCorrente(venilton, 1000);
        Conta ccJorge = new ContaCorrente(jorge, 500);
        Conta ccWesley = new ContaCorrente(wesley, 230);
        Conta poupancaGiselda = new ContaPoupanca(giselda, 3000);
        Conta poupancaMaria = new ContaPoupanca(maria, 350);

        banco.adicionarConta(ccVenilton);
        banco.adicionarConta(ccJorge);
        banco.adicionarConta(ccWesley);
        banco.adicionarConta(poupancaGiselda);
        banco.adicionarConta(poupancaMaria);


        poupancaGiselda.imprimirExtrato();
        poupancaMaria.imprimirExtrato();
        ccJorge.imprimirExtrato();


        ccVenilton.depositar(100);
        ccVenilton.sacar(105);
        ccVenilton.sacar(400);

        ccVenilton.imprimirExtrato();

        ccVenilton.sacar(99);
        ccVenilton.imprimirExtrato();

        System.out.println(banco.encontrarContaPorNumero(4));
        banco.mostrarTodasAsContas();
    }
}