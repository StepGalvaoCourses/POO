package atividades.a10revisaogreve.q3;

public class Pessoa {
    private String nome;
    private double idade;

    public Pessoa(){
        this("Fulano",0);
    }

    public Pessoa(String nome){
        this(nome,0);
    }

    public Pessoa(String nome, double idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public double getIdade(){
        return idade;
    }

    public void setNome(String valor){
        nome = valor;
    }

    public void setIdade(double valor){
        idade = valor;
    }
    
    public String exibir(){
        return "Nome:"+nome+" "+"Idade:"+idade;
    }
}
