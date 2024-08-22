package aulas.heranca.exemplo6sobrescrita;

public class ContaCorrente extends Conta {
    
    public void cobrarTaxa() {
        super.sacar(4);
    }
}
