package atividades.a10revisaogreve.q6;
/**
 * Consumidora
 */
public class Consumidora {

    private double consumoMensal;
    private double precoDoCredito;
    private double creditoCarbono;
    private double saldo;

    public Consumidora(double consumoMensal, double precoDoCredito){
        this.consumoMensal = consumoMensal;
        this.precoDoCredito = precoDoCredito;
    }

    public void consumir(){
        this.creditoCarbono += this.consumoMensal;
    }

    public boolean venderCredito(double qtCredito){
        if(this.creditoCarbono >= qtCredito){
            this.saldo += qtCredito * this.precoDoCredito;
            this.creditoCarbono -= qtCredito;
            return true;
        }else{
            return false;
        }
    }

    public double getPrecoDoCredito(){
        return this.precoDoCredito;
    }
}