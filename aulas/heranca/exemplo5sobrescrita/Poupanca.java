package aulas.heranca.exemplo5sobrescrita;

public class Poupanca extends Conta {
    
    private int numeroDeSaques = 0;

    public void render() {
        saldo += saldo * 0.01;
    }

    @Override
    public void sacar(double valor) {
        if(this.numeroDeSaques<3 ){
            this.saldo -= valor;
            this.numeroDeSaques++;
        }
    }
}