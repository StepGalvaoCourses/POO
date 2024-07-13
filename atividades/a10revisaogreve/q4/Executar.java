package atividades.a10revisaogreve.q4;

public class Executar {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        Lampada l2 = new Lampada();
        Lampada l3 = new Lampada();

        l1.apagar();
        l2.aceder();
        System.out.println(l1.getEstado());
        l3.apagar();
        System.out.println(l3.getEstado());
    }
}
