package atividades.trabalhoprova.q1;

public class LampadaTresEstados {

    /**
     * 0 - apagada
     * 1 - meia luz
     * 2 - acesa
     */
    private int estado;

    public int getEstado() {
        return estado;
    }

    public LampadaTresEstados(){
        this.estado = 0;
    }

    public void apagar(){
        this.estado = 0;
    }

    public void acender(){
        this.estado =2;
    }

    public void meiaLuz(){
        this.estado = 1;
    }

    
}