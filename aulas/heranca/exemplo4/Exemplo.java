package aulas.heranca.exemplo4;

public class Exemplo {
    public static void main(String[] args) {
        Poupanca p = new Poupanca();
        ContaCorrente c = new ContaCorrente();

        p.depositar(100);
        p.sacar(10);
        p.render();
        System.out.println(p.getSaldo());

        c.depositar(150);
        c.sacar(30);
        c.cobrarTaxa();
        System.out.println(c.getSaldo());
    }
}
