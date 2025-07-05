import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the unit of measurement (Celsius, Fahrenheit, or Kelvin): ");
        scanner.nextLine(); // Consume the leftover newline
        String originalUnit = scanner.nextLine().trim().toLowerCase();

        double celsius = 0, fahrenheit = 0, kelvin = 0;

        if (originalUnit.equals("celsius") || originalUnit.equals("c")) {
            celsius = temperature;
            fahrenheit = (temperature * 9/5) + 32;
            kelvin = temperature + 273.15;
        } else if (originalUnit.equals("fahrenheit") || originalUnit.equals("f")) {
            celsius = (temperature - 32) * 5/9;
            fahrenheit = temperature;
            kelvin = celsius + 273.15;
        } else if (originalUnit.equals("kelvin") || originalUnit.equals("k")) {
            celsius = temperature - 273.15;
            fahrenheit = (celsius * 9/5) + 32;
            kelvin = temperature;
        } else {
            System.out.println("Invalid unit of measurement. Please enter Celsius, Fahrenheit, or Kelvin.");
            scanner.close();
            return;
        }

        System.out.println("Converted Temperatures:");
        System.out.printf("Celsius: %.2f °C\n", celsius);
        System.out.printf("Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Kelvin: %.2f K\n", kelvin);

        scanner.close();
    }
}