package atividades.prova2.q5;

public class Executar {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.depositar(100);
        c2.depositar(150);
        c1.sacar(40);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
}
