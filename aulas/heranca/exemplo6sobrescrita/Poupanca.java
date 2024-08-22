package aulas.heranca.exemplo6sobrescrita;

public class Poupanca extends Conta {
    
    private int numeroDeSaques = 0;

    public void render() {
        double valor = super.getSaldo() * 0.01;
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        if(this.numeroDeSaques<3 ){
            super.sacar(valor);
            this.numeroDeSaques++;
        }
    }
}