package aulas.heranca.exemplo2;

public class Exemplo {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Pessoa pp = new Pessoa();

        a1.nome = "José";
        a1.cpf = "00011122233";
        a1.media = 9.5;

        p1.nome = "Maria";
        p1.cpf = "11122233344";
        p1.salario = 1250.45;

        pp.nome = "João";
        pp.cpf = "22233344455";
    }
}
