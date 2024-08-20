package atividades.prova22.q3;

public class Executar {
    public static void main(String[] args) {
        Lamparina l1 = new Lamparina(2);
        Lamparina l2 = new Lamparina();

        l1.acender();
        l1.apagar();
        l1.acender();
        l1.apagar();
        l1.acender();
        
        l2.acender();
        l2.apagar();

        System.out.println(l1.getEstado());
        System.out.println(l2.getEstado());
    }
}
