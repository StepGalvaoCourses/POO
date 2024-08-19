package atividades.trabalhoprova.q2;

public class LampadaDimerizada {

    private int luminosidade;

    public int getLuminosidade() {
        return luminosidade;
    }

    public LampadaDimerizada() {
        this.luminosidade = 0;
    }

    public void apagar(){
        this.luminosidade = 0;
    }

    public void acender(){
        this.luminosidade = 100;
    }

    public void aumentarLuminosidade(){
        this.luminosidade += 10;
    }

    public void diminuirLuminosidade(){
        this.luminosidade -= 10;
    }

    
    
}
