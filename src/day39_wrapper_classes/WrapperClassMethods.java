package day39_wrapper_classes;

import java.awt.geom.Line2D;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(5,10));
        System.out.println(Integer.sum(15,35));
        System.out.println(Integer.min(3, 78));
        System.out.println(Integer.compare(5, 8));
        System.out.println("MIN INT: " + Integer.MIN_VALUE);

        System.out.println(Double.max(234.4,23.9));
        System.out.println(Double.compare(5,1));
        System.out.println(Double.compare(5,5));
        System.out.println(Double.compare(5,45));

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));

        char letter = 'A';
        if (Character.isUpperCase(letter)) {
            System.out.println("It is an upppercase");
        }

        String word = "JaVa iS FuN";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                System.out.print(word.charAt(i));
            }
        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Boolean.TRUE);
    }
}
