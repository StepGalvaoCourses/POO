package atividades.trabalhoprova.q2;

public class Exemplo {
    public static void main(String[] args) {
        LampadaDimerizada l = new LampadaDimerizada();
        l.acender();
        l.diminuirLuminosidade();
        l.diminuirLuminosidade();
        System.out.println(l.getLuminosidade());
    }
}
