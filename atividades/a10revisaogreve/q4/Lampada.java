package atividades.a10revisaogreve.q4;

public class Lampada {
    private boolean estado;

    public Lampada(){
        this.estado = false;        
    }

    public boolean getEstado(){
        return estado;
    }

    public void aceder(){
        this.estado = true;
    }

    public void apagar(){
        this.estado = false;
    }    
}
