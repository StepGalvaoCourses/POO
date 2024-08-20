package atividades.prova22.q5;

public class Executar {
    public static void main(String[] args) {
        Caixa c1 = new Caixa();
        Caixa c2 = new Caixa();
        System.out.println(c1.gerarSenha());
        System.out.println(c1.gerarSenha());
        System.out.println(c1.gerarSenha());
        System.out.println(c1.chamarSenha());

        System.out.println(c2.gerarSenha());
        System.out.println(c2.chamarSenha());
    }

}
