package atividades.prova22.q5;

public class Caixa {

    private static int senhaEmAtendimento;
    private static int ultimaSenhaDistribuida;

    public int gerarSenha(){
        ultimaSenhaDistribuida += 1;
        return ultimaSenhaDistribuida;
    }

    public int chamarSenha(){
        senhaEmAtendimento+=1;
        return senhaEmAtendimento;
    }
    
}
