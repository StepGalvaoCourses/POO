package atividades.a13estatico.q4;

public class Exemplo {
    public static void main(String[] args) {
        // Exemplos de uso
        double celsius = 25.0;
        double fahrenheit = 77.0;
        double kelvin = 298.15;

        System.out.println(celsius + "°C é igual a " + ConversorTemperatura.celsiusParaFahrenheit(celsius) + "°F");
        System.out.println(fahrenheit + "°F é igual a " + ConversorTemperatura.fahrenheitParaCelsius(fahrenheit) + "°C");
        System.out.println(celsius + "°C é igual a " + ConversorTemperatura.celsiusParaKelvin(celsius) + " K");
        System.out.println(kelvin + " K é igual a " + ConversorTemperatura.kelvinParaCelsius(kelvin) + "°C");
        System.out.println(fahrenheit + "°F é igual a " + ConversorTemperatura.fahrenheitParaKelvin(fahrenheit) + " K");
        System.out.println(kelvin + " K é igual a " + ConversorTemperatura.kelvinParaFahrenheit(kelvin) + "°F");
    }
}
