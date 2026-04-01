package gabaritos.trabalho2;
import java.awt.Rectangle;
import java.util.Scanner;
import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Nesta solução usa-se o objeto DateTimeFormatter
 * ele é usado para criar um string da data no formato deseja
 * neste caso dd/MM/yyyy
 */

public class Questao11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rd = new Random();
        //Criação do DateTimeFormatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Definição dos Lotes
        Rectangle f1 = new Rectangle(0, 0, 500, 400);
        Rectangle f2 = new Rectangle(500, 0, 800, 400);
        Rectangle f3 = new Rectangle(1300, 0, 400, 400);
        Rectangle f4 = new Rectangle(0, 400, 1700, 200);

        // Entrada da Mina
        System.out.print("Coordenada X inicial: ");
        int x = entrada.nextInt();
        System.out.print("Coordenada Y inicial: ");
        int y = entrada.nextInt();
        System.out.print("Largura da mina: ");
        int l = entrada.nextInt();
        System.out.print("Comprimento da mina: ");
        int c = entrada.nextInt();

        Rectangle mina = new Rectangle(x, y, l, c);

        // Processamento
        int protocolo = rd.nextInt(10001);
        LocalDate emissao = LocalDate.now();
        LocalDate validade = emissao.plusYears(2);

        // Saída do Relatório
        System.out.println("\nProtocolo de Registro: #" + protocolo);
        // Utilização do DateTimeFormatter para exibir a data no formato desejado
        System.out.println("Data de Emissão: " + emissao.format(dtf));
        // Utilização do DateTimeFormatter para exibir a data no formato desejado
        System.out.println("Data de Validade: " + validade.format(dtf));
        System.out.println("PROPRIETÁRIOS AFETADOS PELA MINA:");
        
        if (f1.intersects(mina)) System.out.println("Filho 1");
        if (f2.intersects(mina)) System.out.println("Filho 2");
        if (f3.intersects(mina)) System.out.println("Filho 3");
        if (f4.intersects(mina)) System.out.println("Filho 4");
    }
}