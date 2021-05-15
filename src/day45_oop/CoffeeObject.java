package day45_oop;

public class CoffeeObject {
    public static void main(String[] args) {
    Coffee latte = new Coffee();
        System.out.println("Coffee amount = " + latte.getAmount());
        latte.refill();
        System.out.println("Amount after refill = " + latte.getAmount());
        latte.drink(10);
        System.out.println("Amount after drinking = " + latte.getAmount());
        //NOT: myCoffee.type = "Turkish coffee"; INSTEAD using a method
        latte.setType("Turkish coffee");
        System.out.println("My Coffee = " + latte.getType());
        //describe my coffee - show all variable values
        System.out.println(latte.toString());
    }
}
