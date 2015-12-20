package home.work.module4;

/**
 * Created by Vitalik on 20.12.2015.
 */
public class Thermometr {
    public double convertCelsiusFahrenheit(double celsius){
        return celsius*1.8+32;
    }
    public double convertFahrenheitCelsius(double fahrenheit){
        return (fahrenheit-32)/1.8;
    }
}
