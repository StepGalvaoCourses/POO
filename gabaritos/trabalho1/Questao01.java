package gabaritos.trabalho1;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura = entrada.nextDouble();
        double base = entrada.nextDouble();
        double area = (altura * base) / 2;
        System.out.println("Area="+area);
    }
}
/**
 * Atenção:
 *  - Para fins didáticos não estou exigindo que o objeto Scanner seja fechado com close(). Por isso, 
 *    pode aparecer um aviso no código.
 *  - Não foram colocadas mensagens antes do comando de entrada para deixar a classe simples.
 */