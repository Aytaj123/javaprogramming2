package day40_arraylist;
import java. util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>(); // polymorphic way of declaring
        System.out.println(nums);
        System.out.println("Size = " + nums.size());

        nums.add(34); nums.add(44); nums.add(2); nums.add(26); nums.add(500); nums.add(5); nums.add(0); nums.add(17);
        nums.add(65); nums.add(12); nums.add(1);
        System.out.println("nums = " + nums);
        nums.remove(0); // remove 1st one
        System.out.println("nums = " + nums);
        //nums.remove(88); // it will think it's and index. It's outofbound exception
        nums.remove(new Integer(44)); //it's the way how to remove the value
        System.out.println("nums = " + nums);

        //for loop - iterate through all values and print
        for (int i = 0; i < nums.size(); i++ ) {
            System.out.println(nums.get(i));

        }

        //for each loop , and print all in the same line
        for (Integer each : nums ) {
            System.out.print(each +" ");
        }
    }
}
