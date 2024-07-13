package atividades.a10revisaogreve.q1;


public class Executar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("José");
        Pessoa p3 = new Pessoa("Maria", 20);
        
        System.out.println("Nome:"+p1.getNome()+" "+"Idade:"+p1.getIdade());
        System.out.println("Nome:"+p2.getNome()+" "+"Idade:"+p2.getIdade());
        System.out.println("Nome:"+p3.getNome()+" "+"Idade:"+p3.getIdade());

    }
    
}
