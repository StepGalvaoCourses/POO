package gabaritos.trabalho2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        LocalDate aula = LocalDate.of(2025, 4, 12);
        LocalDate prova = aula.plusDays(25);

        int dia = prova.getDayOfMonth();
        int mes = prova.getMonthValue();
        int ano = prova.getYear();

        System.out.println(dia+"/"+mes+"/"+"/"+ano);
    }
}