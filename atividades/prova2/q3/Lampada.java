package atividades.prova2.q3;

public class Lampada {
    public boolean estado = false;

    public boolean getEstado() {
        return estado;
    }

    public void ligar(){
        this.estado = true;
    }

    public void desligar(){
        this.estado = false;
    }
}
