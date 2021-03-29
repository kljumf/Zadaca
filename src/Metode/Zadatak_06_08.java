package Metode;

//(Conversions between Celsius and Fahrenheit) Write a class that contains
// the following two methods:
///** Convert from Celsius to Fahrenheit */
//public static double celsiusToFahrenheit(double celsius)
///** Convert from Fahrenheit to Celsius */
//public static double fahrenheitToCelsius(double fahrenheit)
//The formula for the conversion is:
//fahrenheit = (9.0 / 5) * celsius + 32
//celsius = (5.0 / 9) * (fahrenheit – 32)
//Write a test program that invokes these methods to display the following tables:

public class Zadatak_06_08 {
    public static void main(String[] args) {
        System.out.println("Celsius          Fahrenheit | Fahrenheit       Celsius");
        for (int i = 40, y = 120; i >= 31; i--, y -= 10) {
            System.out.println(i + "                " + celsiusToFahrenheit(i)
                    + " | " + y + "                " + fahrenheitToCelsius(y));
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenhite = (9.0 / 5) * celsius + 32;
        return fahrenhite;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
