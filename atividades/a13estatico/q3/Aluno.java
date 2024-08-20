package atividades.a13estatico.q3;

public class Aluno {
    private static double maiorMediaTurma = 0;
    private double media;
    private String nome;

    public Aluno(double media, String nome) {
        this.media = media;
        this.nome = nome;

        if(media>= Aluno.maiorMediaTurma){
            Aluno.maiorMediaTurma = media;
        }
    }

    public double getMedia() {
        return media;
    }

    public String getNome() {
        return nome;
    }

    public double calcularMediaFinal(){
        double mediaFinal = (this.media/Aluno.maiorMediaTurma) * 10;
        return mediaFinal;
    }
}
