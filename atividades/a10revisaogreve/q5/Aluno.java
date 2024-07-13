package atividades.a10revisaogreve.q5;

public class Aluno {
    private String nome;
    private double media;
    
    public Aluno(String nome, double media) {
        this.nome = nome;
        this.media = media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public String getSituacao(){
        if(media>=7){
            return "Aprovado";
        }else{
            if(media<4){
                return "Reprovado";
            }else{
                return "Prova Final";
            }
        }
    }

    public String exibir(){
        return "Nome :"+this.getNome()+"\n"+
                "Media:"+this.getMedia()+"\n"+
                "Situação:"+this.getSituacao();
    }
}
