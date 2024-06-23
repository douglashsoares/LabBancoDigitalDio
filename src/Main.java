public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.sacar(105);
        cc.sacar(400);

        cc.imprimirExtrato();

        cc.sacar(99);
        cc.imprimirExtrato();
    }
}