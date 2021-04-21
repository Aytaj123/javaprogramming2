package day40_arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println(" size = " + shoppingList.size());
        System.out.println("Is Empty? = " + shoppingList.isEmpty());
        if (shoppingList.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");
        if (shoppingList.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);
        System.out.println("Is shoes in my list ? = " + shoppingList.contains("shoes"));
        if (shoppingList.contains("shoes")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("Buying shoes.... $80");

        shoppingList.remove("shoes");
        System.out.println("list = " + shoppingList);

        System.out.println("Done shopping. Let's come back home");
        shoppingList.clear();
        System.out.println(shoppingList); // clear all




    }
}
