package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);
        cars += 5;
        System.out.println("cars in parking lot = " + cars);

        //6 cars left the parking lot
        cars -= 1;
        System.out.println("cars in parking lot = " + cars);

        int electricCars = 13;
        cars = cars + electricCars;
        System.out.println("cars in parking lot = " + cars);

        cars += electricCars;
        System.out.println("cars in parking lot = " + cars);

        String word = "Java";
        System.out.println("word = " + word);

        word = word + "programming";
        System.out.println("word = " + word);
        //add is fun
        word += "is fun";
        System.out.println("word = " + word);
        String selenium = " but selenium is more fun";
        word += selenium;
        System.out.println("selenium = " + selenium);

        word += 12345;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("parkingFee = " + parkingFee);
        parkingFee /= 2;
        System.out.println("Early bird parkingFee = " + parkingFee);
        parkingFee -= parkingFee;
        System.out.println("weekend parkingFee = " + parkingFee);

    }
}
