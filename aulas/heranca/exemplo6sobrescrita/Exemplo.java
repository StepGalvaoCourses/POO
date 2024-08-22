package aulas.heranca.exemplo6sobrescrita;

public class Exemplo {
    public static void main(String[] args) {
        Poupanca p = new Poupanca();
        p.depositar(1000);
        p.sacar(100);
        p.sacar(100);
        p.sacar(100);
        System.out.println(p.getSaldo());

        p.sacar(100);
        System.out.println(p.getSaldo());
    }
}
