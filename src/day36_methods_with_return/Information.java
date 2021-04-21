package day36_methods_with_return;
import java.util.*;
public class Information {
    public static void main(String[] args) {
        fullName();
        System.out.println("Full name is  " + fullName());
        isMarried();
        System.out.println("Is he married? - " + isMarried());
        getAge();
        System.out.println("How old is he? - " + getAge());
        System.out.println("Birth year = " + getRandomYear() );


        String name = fullName();
        boolean isMarried = isMarried();
        int age = getAge();
        int year = getRandomYear();

    }

    public static String fullName() {
        return "Mike Smith";
    }

    public static boolean isMarried() {
        return true;

    }

    public static int getAge() {
        return 35;
    }

    public static int getRandomYear() {
        Random random = new Random();
            int randomYear = random.nextInt(2021);
            return randomYear;
    }

}