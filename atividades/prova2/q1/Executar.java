package atividades.prova2.q1;

public class Executar {
    public static void main(String[] args) {
        Conta c1 = new Conta(10);
        Conta c2 = new Conta(11);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getNumero());
    }
}
