package gabaritos.trabalho1;
import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor:");
        int valor = entrada.nextInt();
        
        int n100 = valor / 100;
        valor %= 100;
        int n50 = valor / 50;
        valor %= 50;
        int n20 = valor / 20;
        valor %= 20;
        int n10 = valor / 10;
        valor %= 10;
        int n5 = valor / 5;
        valor %= 5;
        int n2 = valor / 2;
        valor %= 2;
        int n1 = valor;

        System.out.println(n100 + " nota(s) de R$ 100");
        System.out.println(n50 + " nota(s) de R$ 50");
        System.out.println(n20 + " nota(s) de R$ 20");
        System.out.println(n10 + " nota(s) de R$ 10");
        System.out.println(n5 + " nota(s) de R$ 5");
        System.out.println(n2 + " nota(s) de R$ 2");
        System.out.println(n1 + " nota(s) de R$ 1");
    }
}