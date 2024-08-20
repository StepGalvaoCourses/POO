package atividades.a13estatico.q4;

public class ConversorTemperatura {

    // Converte Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Converte Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Converte Celsius para Kelvin
    public static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Converte Kelvin para Celsius
    public static double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Converte Fahrenheit para Kelvin
    public static double fahrenheitParaKelvin(double fahrenheit) {
        return celsiusParaKelvin(fahrenheitParaCelsius(fahrenheit));
    }

    // Converte Kelvin para Fahrenheit
    public static double kelvinParaFahrenheit(double kelvin) {
        return celsiusParaFahrenheit(kelvinParaCelsius(kelvin));
    }

    public static void main(String[] args) {
        // Exemplos de uso
        double celsius = 25.0;
        double fahrenheit = 77.0;
        double kelvin = 298.15;

        System.out.println(celsius + "°C é igual a " + celsiusParaFahrenheit(celsius) + "°F");
        System.out.println(fahrenheit + "°F é igual a " + fahrenheitParaCelsius(fahrenheit) + "°C");
        System.out.println(celsius + "°C é igual a " + celsiusParaKelvin(celsius) + " K");
        System.out.println(kelvin + " K é igual a " + kelvinParaCelsius(kelvin) + "°C");
        System.out.println(fahrenheit + "°F é igual a " + fahrenheitParaKelvin(fahrenheit) + " K");
        System.out.println(kelvin + " K é igual a " + kelvinParaFahrenheit(kelvin) + "°F");
    }
}
