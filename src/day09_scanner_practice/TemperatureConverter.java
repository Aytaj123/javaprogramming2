package day09_scanner_practice;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ##### F TO C CONVERTER ##### ");
        System.out.println("Enter Fahrenheit value:");
        double fahrenheitValue = scan.nextDouble();
        double celciusValue = (fahrenheitValue - 32) * 5 / 9;
        System.out.println(fahrenheitValue + " F is in C " + celciusValue);
    }
}
