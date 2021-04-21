package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        String word = "wooden spoon";
        count(word.length() );
        printAge(1992);
        int birthYear = 1992;
        //int year = 2021;
    }
    public static void count(int num) {
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }

        public static void printAge(int year) {
            int age = 2021 - year;
            System.out.println("BirthYear: " + year + ".Age " + age);



    }
}
