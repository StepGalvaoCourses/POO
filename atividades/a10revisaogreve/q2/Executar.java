package atividades.a10revisaogreve.q2;

public class Executar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("José");
        Pessoa p3 = new Pessoa("Maria", 20);
        
        System.out.println(p1.exibir());
        System.out.println(p2.exibir());
        System.out.println(p3.exibir());
    }
    
}
