package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(20.0, 4.0));
        double sum = add(20.0, 4.0);
        System.out.println("sum = " + sum);
        double minus= minus(20.0, 4.0);
        System.out.println("minus = " + minus);
        double multiplication = multiply(20.0, 4.0);
        System.out.println("multiplication = " + multiplication);
        double division = divide(20.0, 4.0);
        System.out.println("division = " + division);

    }

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;

    }

    public static double minus(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }
}