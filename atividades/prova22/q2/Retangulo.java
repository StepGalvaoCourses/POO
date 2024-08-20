package atividades.prova22.q2;

public class Retangulo {
    private double b;
    private double a;

    public Retangulo(double b, double a) {
        this.b = a;
        this.a = b;
    }
    
    public Retangulo(){
        this(5,10);
    }

    public double areaDoida(){
        a = this.a + this.b;
        this.b += 1;
        return 2 * this.a + 3 * this.b;
    }
}
