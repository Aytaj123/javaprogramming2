package day31_arrays;
import java.util.Arrays;
public class ArraysUtil {
    public static void main(String[] args) {
        int [] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        //print all nums in the same line
        System.out.println(Arrays.toString(nums));

        // we sort nums
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("min value = " + nums[0]);//min value
        System.out.println("max value = " + nums[nums.length - 1]);


        String[] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(", ", words)+"]");

        //sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        //sort words in reverse order
       // Arrays.sort(words, Collections.reverseOrder());

        System.out.println(Arrays.toString(words));
    }
}
