package atividades.prova22.q1;

public class Executar {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c1.depositar(100);
        c1.depositar(50);
        c2.depositar(50);
        c1.sacar(40);
        c2.sacar(10);
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
}
