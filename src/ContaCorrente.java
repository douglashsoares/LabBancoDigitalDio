public class ContaCorrente extends Conta {

    double limiteChequeEspecial = 500;

    public ContaCorrente(Cliente cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void sacar(double valor){
        if (valor <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
            saldo -= valor;
        } else {
            double diferenca = valor - saldo;
            if(diferenca <= limiteChequeEspecial){
                saldo = 0;
                limiteChequeEspecial -= diferenca;
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            }else{
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        if (saldo <= 0 ){
            System.out.println("------------------------------------");
            System.out.println("Cheque Especial:");
            System.out.println("------------------------------------");
            System.out.println("Foi Utilizado: R$" + (500 - limiteChequeEspecial) + " do Check Especial");
            System.out.println("Limite: R$" + limiteChequeEspecial);
        }
    }


}
