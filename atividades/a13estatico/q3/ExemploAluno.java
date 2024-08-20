package atividades.a13estatico.q3;

public class ExemploAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(6.0, "José");
        Aluno a2 = new Aluno(7.0, "Pedro");
        Aluno a3 = new Aluno(8.0, "Maria");

        System.out.println("Nome: "+ a1.getNome());
        System.out.println("Media: "+ a1.getMedia());
        System.out.println("Media Final: "+ a1.calcularMediaFinal());

        System.out.println("Nome: "+ a2.getNome());
        System.out.println("Media: "+ a2.getMedia());
        System.out.println("Media Final: "+ a2.calcularMediaFinal());

        System.out.println("Nome: "+ a3.getNome());
        System.out.println("Media: "+ a2.getMedia());
        System.out.println("Media Final: "+ a3.calcularMediaFinal());
    }
}
