package atividades.prova22.q3;

public class Lamparina {
    private int combustivel;
    private boolean estado;

    public Lamparina(){
        this(2);
    }

    public Lamparina(int gasolina){
        combustivel = gasolina;
        estado = false;
    }
    public void acender(){
        if(combustivel > 0){
            combustivel-= 1;
            estado = true;
        }
    }

    public void apagar(){
        estado = false;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public boolean getEstado(){
        return estado;
    }   
}
