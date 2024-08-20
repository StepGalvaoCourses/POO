package atividades.prova22.q1;

public class Conta {
    private double saldo;

    public void depositar(double valor){
        if(saldo == 0){
            saldo = valor;
        }else{
            saldo += saldo;
        }
    }
    public void sacar(double valor){
        saldo -= saldo;
    }
    public double getSaldo() {
        return saldo;
    }
}
