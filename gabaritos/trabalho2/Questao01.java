package gabaritos.trabalho2;
import java.awt.Rectangle;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Instanciando os lotes dos quatro irmãos
        Rectangle filho1 = new Rectangle(0, 0, 500, 400);
        Rectangle filho2 = new Rectangle(500, 0, 800, 400);
        Rectangle filho3 = new Rectangle(1300, 0, 400, 400);
        Rectangle filho4 = new Rectangle(0, 400, 1700, 200);

        int x = 750;
        int y = 250;

        System.out.println("SISTEMA DE VERIFICAÇÃO DE PROPRIEDADES ---");
        System.out.println("Analisando coordenadas do poço: (" + x + ", " + y + ")");
        
        System.out.println("Verificando Lote do Filho 1... " + filho1.contains(x, y));
        System.out.println("Verificando Lote do Filho 2... " + filho2.contains(x, y));
        System.out.println("Verificando Lote do Filho 3... " + filho3.contains(x, y));
        System.out.println("Verificando Lote do Filho 4... " + filho4.contains(x, y));
    }
}