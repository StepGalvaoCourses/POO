package atividades.a10revisaogreve.q6;
public class Executar {
    public static void main(String[] args) {
        Consumidora florestal = new Consumidora(10, 24.50);
        Emissora mTransportes = new Emissora(2000, 10);

        //simular passagem do mês 1
        florestal.consumir();
        mTransportes.produzir();

        //simular passagem do mês 2
        florestal.consumir();

        //Realizando operação de compra e venda de crédito
        mTransportes.comprarCarbono(10.0, florestal.getPrecoDoCredito());
        florestal.venderCredito(10.0);
        


    }
}
