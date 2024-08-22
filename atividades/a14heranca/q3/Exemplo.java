package atividades.a14heranca.q3;

public class Exemplo {
    public static void main(String[] args) {
        Gato g1 = new Gato();
        Cachorro c1 = new Cachorro();

        g1.nome = "Xanim";
        g1.raca = "Pé duro";
        g1.caminhar();
        g1.comer();
        g1.miar();

        c1.nome = "Caramelho";
        c1.raca = "Vira lata";
        c1.caminhar();
        c1.comer();
        c1.latir();
    }

}
