package gabaritos.trabalho1;
import java.util.Scanner;

public class Questao07{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a distancia:");
        double distancia = entrada.nextDouble();
        System.out.print("Digite a velocidade:");
        double velocidade = entrada.nextDouble();
        double tempoTotal = distancia / velocidade;
        
        int h = (int) tempoTotal;
        System.out.println("Tempo:"+ h);
    }
}