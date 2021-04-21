package day04_variables_intro;

public class BooleanPractice {
    public static void main(String[] args) {
        boolean one = ('a' != 'z');
        boolean two = one || 0 == (9-10+1);
        System.out.println(two);
    }
}
