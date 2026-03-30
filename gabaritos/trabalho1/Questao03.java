package gabaritos.trabalho1;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio = entrada.nextDouble();
        double pi = 3.14;
        double area = pi * raio * raio;
        double comprimento = 2 * pi * raio;
        System.out.println("area=" + area);
        System.out.println("comprimento=" + comprimento);
    }
}

/**
 * Atenção para fins didáticos:
 *  - O objeto Scanner foi fechado, com close(). Por isso, pode aparecer um aviso no código.
 *  - Não foram colocadas mensagens antes do comando de entrada.
 */