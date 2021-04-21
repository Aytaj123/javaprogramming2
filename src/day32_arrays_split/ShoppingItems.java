package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {
                       //     0        1        2         3         4          5
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = { 99.99,   150.0,   9.99,     250.0 ,    439.50, 39.99};
        int[] itemIDs =   {12345 ,   12346,   12347,    12348,      12349, 12350};

        System.out.println("-----FIND AN INDEX OF 'Gloves' in items array-----");
        //use for loop with conditions
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")){
                System.out.println("Gloves were found at index " + i);
                break;
            }
           // System.out.println(i + "-" + items[i]);
        }
        System.out.println("-----Set boolean to true if IPAD is found-----");
        boolean iPadExists = false;
        for (int i = 0; i < items.length; i++ ) {
            if (items[i].equals("iPad" ) ) {
                iPadExists = true;
                break;


            }
        }
        System.out.println("iPadExists = " + iPadExists);


        System.out.println("-----Print a report of each shopping item-----");

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" +prices[i] + " - #" + itemIDs[i]);
            //break;
        }

        System.out.println("-----Print all details about the jacket-----");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket") ) {

                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
            }
        }






    }
}
