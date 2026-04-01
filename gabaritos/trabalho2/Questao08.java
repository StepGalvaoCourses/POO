package gabaritos.trabalho2;

import java.util.Random;

public class Questao08 {
    public static void main(String[] args) {
        Random sorteador = new Random();
        int num = sorteador.nextInt(10);
        System.out.println("Numero = "+num);    
    }
}
