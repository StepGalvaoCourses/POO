package atividades.a10revisaogreve.q7;
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

    public void comprarCarbono(double qtCredito, Consumidora empresa){
        if(empresa.venderCredito(qtCredito)){
            this.totalEmitido -= qtCredito;
            this.saldo -= qtCredito * empresa.getPrecoDoCredito();
        }
    }
}
