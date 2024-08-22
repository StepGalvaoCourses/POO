package aulas.heranca.exemplo4;

public class Poupanca extends Conta {
    
    public void render() {
        double valor = getSaldo() * 0.01;
        depositar(valor);
    }
}