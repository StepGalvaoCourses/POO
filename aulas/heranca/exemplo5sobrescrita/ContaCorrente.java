package aulas.heranca.exemplo5sobrescrita;

public class ContaCorrente extends Conta {
    
    public void cobrarTaxa() {
        saldo -= 4.00;
    }
}
