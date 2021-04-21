package day20_string_manipulation;

public class StringManipulationPractice {
    public static void main(String[] args) {
        String a = "today i will go to the beach";
        boolean b = a.contains("i");
        boolean c = a.substring(12).startsWith("go");
        String result = b && c ? "go" : "don't go";
        System.out.println(result);


        for (int i = 0; i < 10; i++ ) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        int number = 5;
        while (number < 100) {
            number += number;
        }
        System.out.println(number);


    }
}
