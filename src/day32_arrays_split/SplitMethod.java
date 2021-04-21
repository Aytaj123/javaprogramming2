package day32_arrays_split;
import java.util.Arrays;
public class SplitMethod {
    public static void main(String[] args) {
        //               0     1       2       3
        String words = "java, python, selenium, html";

        String [] wordsArray = words.split(",");
        System.out.println(Arrays.toString(wordsArray) );
        System.out.println("Length of array = " + wordsArray.length);

                     //     0     1     2    3   4    5
        String sentence = "Today i'm coding a java arrays";

        for (String each : wordsArray) {
            System.out.println(each);
        }

        String [] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray) );
        System.out.println("Length of array = " + sentenceArray.length);


        System.out.println("First word = " + sentenceArray[0]);
        System.out.println("First word = " + sentence.split(" ") [0] );

        for (String each: sentenceArray) {
            System.out.println(each);
        }



    }
}
