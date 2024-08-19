package atividades.trabalhoprova.q4;

public class Empregado {
    private int matricula;
    private double valorHora;
    private double totalHorasNormaisMes;
    private double totalHorasExtrasMes;

    public Empregado(int matricula, double valorHora){
        this.matricula = matricula;
        this.valorHora = valorHora;
    }

    public void registrarPonto(int chegada, int saida){
        int totalHorasDias = saida - chegada;

        if(totalHorasDias>8){
            this.totalHorasNormaisMes += 8;
            this.totalHorasExtrasMes += totalHorasDias-8;
            
        }else{
            this.totalHorasNormaisMes += totalHorasDias;
        }
    }

    public double calcularSalario(){
        double salarioNormal = this.totalHorasNormaisMes * this.valorHora;
        double valorHoraExtra = this.valorHora + 0.5*this.valorHora;
        double salarioExtra = this.totalHorasExtrasMes * valorHoraExtra;
        this.totalHorasNormaisMes = 0;
        this.totalHorasExtrasMes = 0;
        return salarioNormal + salarioExtra;
    }

}
