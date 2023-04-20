package TemperatureHelper;

public class TemperatureHelper {

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit){
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celcius){
        return (celcius * 9 / 5) + 32;
    }

    public static double CelsiusToKelvin(double celcius){
        return celcius + 273.15;
    }

    public static double KelvinToFahrenheit(double kelvin){
        return kelvin * 9 / 5 - 459.67;
    }
    public static  double KelvinToCelsius(double kelvin){
        return kelvin - 273.15;
    }
}
