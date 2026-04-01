package gabaritos.trabalho2;
import java.time.LocalDate;
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        LocalDate aula = LocalDate.of(2025, 4, 12);
        LocalDate prova1 = aula.plusDays(20);
        LocalDate prova2 = aula.plusDays(40);
        LocalDate prova3 = aula.plusDays(75);


        int dia = prova1.getDayOfMonth();
        int mes = prova1.getMonthValue();
        int ano = prova1.getYear();
        System.out.println("Prova 1:"+dia+"/"+mes+"/"+"/"+ano);

        dia = prova2.getDayOfMonth();
        mes = prova2.getMonthValue();
        ano = prova2.getYear();
        System.out.println("Prova 2:"+dia+"/"+mes+"/"+"/"+ano);

        dia = prova3.getDayOfMonth();
        mes = prova3.getMonthValue();
        ano = prova3.getYear();
        System.out.println("Prova 3:"+dia+"/"+mes+"/"+"/"+ano);
    }
}