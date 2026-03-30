package gabaritos.trabalho1;
import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do salário:");
        double salario = entrada.nextDouble();
        double imposto = salario * 0.10;
        double salarioFinal = salario - imposto;
        System.out.println("Salario: " + salario);
        System.out.println("Imposto: " + imposto);
        System.out.println("Salario Final: " + salarioFinal);
    }
}