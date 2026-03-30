package gabaritos.trabalho1;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura = entrada.nextDouble();
        double largura = entrada.nextDouble();
        double area = altura * largura;
        double perimetro = 2*altura + 2*largura;
        System.out.println("area="+ area);
        System.out.println("perimetro="+ perimetro);
    }
}

/**
 * Atenção para fins didáticos:
 *  - O objeto Scanner foi fechado, com close(). Por isso, pode aparecer um aviso no código.
 *  - Não foram colocadas mensagens antes do comando de entrada.
 */