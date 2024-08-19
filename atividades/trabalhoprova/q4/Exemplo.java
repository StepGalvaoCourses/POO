package atividades.trabalhoprova.q4;

public class Exemplo {
    public static void main(String[] args) {
        Empregado eduardo = new Empregado(111, 500);
 
        eduardo.registrarPonto(8, 16);
        System.out.println(eduardo.calcularSalario());

        eduardo.registrarPonto(8, 17);
        System.out.println(eduardo.calcularSalario());
    }

}
