package atividades.trabalhoprova.q3;

public class Empregado {
    private int matricula;
    private double valorHora;
    private double totalHorasMes;

    public Empregado(int matricula, double valorHora){
        this.matricula = matricula;
        this.valorHora = valorHora;
    }

    public void registrarPonto(int chegada, int saida){
        int totalHorasDias = saida - chegada;
        this.totalHorasMes += totalHorasDias;
    }

    public double calcularSalario(){
        double salario = this.totalHorasMes * this.valorHora;
        this.totalHorasMes = 0;
        return salario;
    }

}
