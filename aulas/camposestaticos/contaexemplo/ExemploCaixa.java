package aulas.camposestaticos.contaexemplo;

public class ExemploCaixa {

    public static void main(String[] args) {
        Caixa c1 = new Caixa(1);
        

        c1.gerarSenha();
        c1.gerarSenha(); 
        c1.gerarSenha();

        c1.chamarSenha();



        Caixa c2 = new Caixa(2);
        

        c2.gerarSenha();
        c2.gerarSenha();

        c2.chamarSenha();
    }

}
