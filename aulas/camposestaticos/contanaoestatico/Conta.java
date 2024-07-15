package aulas.camposestaticos.contanaoestatico;

public class Conta {
    private int numero;
    private double saldo;
    public Conta(int num) {
        this.numero = num;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
}
