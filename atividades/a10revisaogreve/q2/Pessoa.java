package atividades.a10revisaogreve.q2;
public class Pessoa {
    private String nome;
    private double idade;

    public Pessoa(){
        nome = "Fulano";
        idade = 0;
    }

    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 0;
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