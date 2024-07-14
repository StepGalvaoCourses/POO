package atividades.a10revisaogreve.q1;

/**
 * Classe Pessoa v 1.0
 * Criada por Stephenson Galvão para a disciplina 
 * de Programação Orientada a Objetos.
 */
public class Pessoa {
    //Campo de objeto nome do tipo String
    private String nome;
    //Campo de objeto idade do tipo double 
    private double idade;

    /**
     * Construtor sem argumento que cria uma pessoa
     * com o nome fulano e idade igual a 0 (zero)
     */
    public Pessoa(){
        //Atribui o valor fulano ao atributo nome.
        nome = "Fulano";
        //Atribui o valor 0 (zero ao atributo idade). 
        idade = 0;
    }

    /**
     * Construtor que cria um objeto Pessoa com o 
     * nome informado como argumento.
     * @param nome: parametro do tipo String cujo
     * valor será atribuito ao campo nome.
     */
    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 0;
    }

    /**
     * Construtor que recebe dois argumento nome e idade
     * e cria uma pessoa com o nome e idade passado
     * como argumento.
     * @param nome: parâmentro do tipo String.
     * @param idade: parâmentro do tipo idade.
     */
    public Pessoa(String nome, double idade){
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * Método Get do campo nome. Faz parte do encapsulamento
     * do campo. Retorna o valor do campo nome.
     * @return valor do atributo 
     */
    public String getNome(){
        return nome;
    }

    /**
     * Método Get do campo idade. Faz parte do encapsulamento
     * do campo. Retorna o valor do campo idade.
     * @return valor do atributo 
     */
    public double getIdade(){
        return idade;
    }

    /**
     * Método Set do campo nome. Recebe um valor, como argumento,
     * do tipo String e atribui o valor recebido ao campo nome.
     * @param valor: parâmentro do tipo String cujo valor será
     * atribuido ao campo nome.
     */
    public void setNome(String valor){
        nome = valor;
    }

    /**
     * Método Set do campo idade. Recebe um valor, como argumento,
     * do tipo String e atribui o valor recebido ao campo idade.
     * @param valor: parâmentro do tipo String cujo valor será
     * atribuido ao campo idade.
     */
    public void setIdade(double valor){
        idade = valor;
    }
    
}
