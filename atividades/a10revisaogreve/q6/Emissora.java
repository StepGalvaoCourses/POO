package atividades.a10revisaogreve.q6;
public class Emissora {
    private double lucroMensal;
    private double emissaoMensal;
    private double totalEmitido;
    private double saldo;

    public Emissora(double lucroMensal, double emissaoMensal){
        this.lucroMensal = lucroMensal;
        this.emissaoMensal = emissaoMensal;
    }

    public void produzir(){
        this.saldo += this.lucroMensal;
        this.totalEmitido += this.emissaoMensal;
    }

    public void comprarCarbono(double qtCredito, double valorCredito){
        this.totalEmitido -= qtCredito;
        this.saldo -= qtCredito * valorCredito;
        
    }
}
