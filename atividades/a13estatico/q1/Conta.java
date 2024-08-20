package atividades.a13estatico.q1;

public class Conta {
    
    private double saldo;
    private int numero;
    private static int ultimoNumeroGerado = 1000;

    public Conta() {
        this.saldo = 0;
        Conta.ultimoNumeroGerado++;
        this.numero = Conta.ultimoNumeroGerado;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }
}
