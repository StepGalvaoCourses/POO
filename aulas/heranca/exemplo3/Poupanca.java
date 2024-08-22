package aulas.heranca.exemplo3;

public class Poupanca extends Conta {
    
    public void render() {
        saldo += saldo * 0.01;
    }
}