package aulas.camposestaticos.contaexemplo;

/**
 * Caixa
 */
public class Caixa {
    private int numeroDoCaixa = 0;
    private static int senhaEmAtendimeto = 0;
    private static int ultimaSenhaGerada = 0;

    public Caixa(int numeroDoCaixa) {
        this.numeroDoCaixa = numeroDoCaixa;
    }

    public void gerarSenha(){
        Caixa.ultimaSenhaGerada +=1;
    }

    public void chamarSenha(){
        Caixa.senhaEmAtendimeto +=1;
    }
}