package atividades.a13estatico.q2;

public class ContaExemplo {
    public static void main(String[] args) {
        Conta cA = new Conta();
        Conta cB = new Conta();

        cA.deposito(100);
        cA.saque(60);
        System.out.println(cA.getSaldo());
    }
}
