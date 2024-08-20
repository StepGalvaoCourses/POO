package atividades.prova2.q5;

public class Conta {
    private static double saldo;

    public void depositar(double valor){
        this.saldo+=valor;
    }

    public void sacar(double valor){
        this.saldo-=valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
