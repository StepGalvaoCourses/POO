package atividades.prova2.q1;

public class Conta {
    private int numero;
    private double saldo = 0;

    public Conta(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }
}
