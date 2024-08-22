package atividades.a14heranca.q1;

public class Exemplo {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Jose";
        a1.cpf = "00011122233";
        a1.matricula = "231LINF123";
        a1.nivel = "Superior";

        Professor p1 = new Professor();
        p1.nome = "Joao";
        p1.cpf = "11122233344";
        p1.matricula = "1231414";
        p1.saldo = 50;

        Tecnico t1 = new Tecnico();
        t1.nome = "Pedro";
        t1.cpf = "22233344455";
        t1.matricula = "12345";
        t1.saldo = 234;

        Usuario u1 = new Usuario();
        u1.nome = "Usuário nome";
        u1.cpf = "44455566455";
        u1.matricula = "123123";

    }
    
}
