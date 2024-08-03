package aulas.camposestaticos.contaexemplo;

public class Conta {

    public static int totalContas = 0 ;

    public Conta(){
        Conta.totalContas +=1 ;
    }

}
