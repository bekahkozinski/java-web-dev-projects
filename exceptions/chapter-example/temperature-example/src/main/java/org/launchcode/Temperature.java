package org.launchcode;

public class Temperature {
    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

        if (aFahrenheit < absoluteZeroFahrenheit) {
            System.out.println("Value is below absolute zero");
        }

        fahrenheit = aFahrenheit;
    }
    private double aFahrenheit;
    private double absoluteZeroFahrenheit;
    if (aFahrenheit < absoluteZeroFahrenheit) {
        try {
            throw new TemperatureException("That temperature is too low!");
        } catch (TemperatureException e) {
            e.printStackTrace();
        }
    }
}
