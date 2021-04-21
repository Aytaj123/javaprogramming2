package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 10 + 45 = " + Calculator.add(10,45));
        System.out.println("100 - 40 = " + Calculator.add(100,40));



        double d1 = 325.4;
        double d2 = 434.5;
        double result = Calculator.minus(d1,d2);
        System.out.println("result = " + result);

    }
}
