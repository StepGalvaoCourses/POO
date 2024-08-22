package aulas.heranca.exemplo5sobrescrita;

public class Conta {
    protected double saldo;

    public void depositar(double valor) {    
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}