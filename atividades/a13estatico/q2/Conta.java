package atividades.a13estatico.q2;

public class Conta {
    
    private double saldo;
    private int numero;
    private static double porcentagemImposto = 0.01;
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

    public void deposito(double valor){
        this.saldo += valor;
    }

    public void saque(double valor){
        double imposto = valor * Conta.porcentagemImposto;
        this.saldo -= valor;
        this.saldo -= imposto;
    }
}
