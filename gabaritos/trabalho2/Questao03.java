package gabaritos.trabalho2;
import java.awt.Rectangle;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Rectangle filho1 = new Rectangle(0, 0, 500, 400);
        Rectangle filho2 = new Rectangle(500, 0, 800, 400);
        Rectangle filho3 = new Rectangle(1300, 0, 400, 400);
        Rectangle filho4 = new Rectangle(0, 400, 1700, 200);

        System.out.println("Digite X, Y, Largura e Comprimento da nova mina:");
        int x = 300;
        int y = 100;
        int larg = 100;
        int alt = 120;

        Rectangle novaMina = new Rectangle(x, y, larg, alt);

        System.out.println("Verificando Lote do Filho 1... " + filho1.intersects(novaMina));
        System.out.println("Verificando Lote do Filho 2... " + filho2.intersects(novaMina));
        System.out.println("Verificando Lote do Filho 3... " + filho3.intersects(novaMina));
        System.out.println("Verificando Lote do Filho 4... " + filho4.intersects(novaMina));
    }
}