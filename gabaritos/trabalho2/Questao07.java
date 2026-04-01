package gabaritos.trabalho2;
import java.time.LocalDate;
import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("\nDigite a quantidade de dias para o futuro:");
        int acrescimo = entrada.nextInt();
        LocalDate hoje = LocalDate.now();
        LocalDate futura = hoje.plusDays(acrescimo);

        int dias = futura.getDayOfMonth();
        int mes = futura.getMonthValue();
        int ano = futura.getYear();

        System.out.println("Data futura: " + dias+ "/"+mes+"/"+ano);
    }
}