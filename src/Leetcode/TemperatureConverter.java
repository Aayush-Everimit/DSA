import java.util.Arrays;

public class TemperatureConverter
{
    public static void main(String[] args)
    {
        double celsius = 36.50;
        double[] result = convertTemperature(celsius);
        System.out.println(Arrays.toString(result));
    }
    public static double[] convertTemperature(double celsius)
    {
        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        return new double[] {Kelvin, Fahrenheit};
    }
}
