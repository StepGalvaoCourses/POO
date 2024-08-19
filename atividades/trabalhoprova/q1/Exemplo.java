package atividades.trabalhoprova.q1;

public class Exemplo {
    public static void main(String[] args) {
        LampadaTresEstados l = new LampadaTresEstados();
        l.acender();
        l.meiaLuz();

        System.out.println(l.getEstado());
    }
}
