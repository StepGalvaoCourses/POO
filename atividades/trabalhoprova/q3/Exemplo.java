package atividades.trabalhoprova.q3;

public class Exemplo {
    public static void main(String[] args) {
        Empregado eduardo = new Empregado(111, 500);
        eduardo.registrarPonto(8, 12);
        eduardo.registrarPonto(8, 12);
        eduardo.registrarPonto(8, 12);
        eduardo.registrarPonto(8, 12);

        System.out.println(eduardo.calcularSalario());

        eduardo.registrarPonto(8, 17);
        System.out.println(eduardo.calcularSalario());
    }

}
