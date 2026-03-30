package gabaritos.trabalho1;
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a temperatura em ºC:");
        double celsius = entrada.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = (fahrenheit + 459.67) / 1.8;
        System.out.println("celsius=" + celsius);
        System.out.println("Fahrenheit=" + fahrenheit);
        System.out.println("Kelvin=" + kelvin);
    }
}