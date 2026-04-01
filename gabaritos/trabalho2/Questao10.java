package gabaritos.trabalho2;
import java.util.Random;
import java.time.LocalDate;

public class Questao10 {
    public static void main(String[] args) {
        Random sorteio = new Random();

        int aluno = sorteio.nextInt(9) + 1; // Sorteia de 1 a 9
        int folga = sorteio.nextInt(6) + 10; // Sorteia entre 10 e 15
        LocalDate dataApresentacao = LocalDate.now().plusDays(folga);

        int dias = dataApresentacao.getDayOfMonth();
        int mes = dataApresentacao.getMonthValue();
        int ano = dataApresentacao.getYear();

        System.out.println("Aluno " + aluno + ": "+ dias+ "/"+ mes+"/"+ ano+" (" + folga + " dias)");
    }
}