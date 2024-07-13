package atividades.a10revisaogreve.q7;
public class Executar {
    public static void main(String[] args) {
        Consumidora florestal = new Consumidora(10, 24.50);
        Emissora mTransportes = new Emissora(2000, 10);

        //simular passagem do mês 1
        florestal.consumir();
        mTransportes.produzir();

        //simular passagem do mês 2
        florestal.consumir();

        mTransportes.comprarCarbono(10.0, florestal);
        


    }
}
