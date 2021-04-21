package day32_arrays_split;
import java.util.Arrays;
public class MaxMinPrice {
    public static void main(String[] args) {
        //      0          1          2         3        4         5
        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        // print array value as a String
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));

        System.out.println("----Find and print all details of more expensive item");
        double maxPrice = prices[0];
        int indexOfMaxPrice = 0;

        for (int i = 0; i < items.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];

            }
        }
        System.out.println("MaxPrice = " + maxPrice);
        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice);
        System.out.println(items[indexOfMaxPrice] + " - $" + prices[indexOfMaxPrice] + " - #" + itemIDs[indexOfMaxPrice]);




    }
}
