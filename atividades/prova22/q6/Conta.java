package atividades.prova22.q6;

public class Conta {
    private double saldo;
    private Pessoa titular;

    public Conta(Pessoa titular){
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }
}
