import java.util.ArrayList;
import java.util.List;

public class Banco {

    private final List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public String encontrarContaPorNumero(int numeroDoCliente){
        for(Conta conta: contas){
            if (conta.getNumero() == numeroDoCliente){
                return conta.cliente.getNome();
            }
        }
        return null;
    }

    public void mostrarTodasAsContas(){
        for (Conta conta: contas){
            System.out.println("Titular: " + conta.cliente.getNome());
        }
    }

}
