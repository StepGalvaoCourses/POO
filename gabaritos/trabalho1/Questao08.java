package gabaritos.trabalho1;
import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a distancia:");
        double distancia = entrada.nextDouble();
        System.out.print("Digite a velocidade:");
        double velocidade = entrada.nextDouble();
        double tempoTotal = distancia / velocidade;
        
        int h = (int) tempoTotal;
        int m = (int) ((tempoTotal - h) * 60);
        int s = (int) ((((tempoTotal - h) * 60) - m) * 60);
        
        System.out.println("Tempo: " + h + "h " + m + "m " + s + "s.");
    }
}