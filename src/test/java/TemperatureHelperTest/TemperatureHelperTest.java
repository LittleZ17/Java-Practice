package TemperatureHelperTest;

import TemperatureHelper.TemperatureHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureHelperTest {

    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius_doubleFahrenheit_celcius() {
        assertEquals(0, TemperatureHelper.fahrenheitToCelsius(32));
        assertEquals(25, TemperatureHelper.fahrenheitToCelsius(77));
    }

    @Test
    void fahrenheitToKelvin_doubleFahrenheit_kelvin() {
        assertEquals(263.15, TemperatureHelper.fahrenheitToKelvin(14));
        assertEquals(268.15, TemperatureHelper.fahrenheitToKelvin(23));
    }

    @Test
    void celsiusToFahrenheit_doubleCelcius_fahrenheit() {
        assertEquals(32, TemperatureHelper.celsiusToFahrenheit(0));
        assertEquals(41, TemperatureHelper.celsiusToFahrenheit(5));
    }

    @Test
    void celsiusToKelvin_doubleCelcius_kelvin() {
        assertEquals(273.15, TemperatureHelper.CelsiusToKelvin(0));
        assertEquals(303.15, TemperatureHelper.CelsiusToKelvin(30));
    }

    @Test
    void kelvinToFahrenheit_doubleKelvin_fahrenheit () {
        assertEquals(-459.67, TemperatureHelper.KelvinToFahrenheit(0));
        assertEquals(260.33, TemperatureHelper.KelvinToFahrenheit(400));
    }

    @Test
    void kelvinToCelsius_doubleKelvin_celcius() {
        assertEquals(-273.15, TemperatureHelper.KelvinToCelsius(0));
        assertEquals(26, TemperatureHelper.KelvinToCelsius(299.15));
    }
}