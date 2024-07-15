package aulas.camposestaticos.contaestatico;

public class Conta {
    private static int ultimoNumero=100;

    private int numero=0;
    private double saldo=0;
    public Conta() {
        this.numero = ultimoNumero+1;
        ultimoNumero = this.numero;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
}
