package day24_loops;

public class DoWhile1 {
    public static void main(String[] args) {

        String str = "The whole time it was raining";
        do {
            System.out.println(str.charAt(0));
            str = str.substring(3);
        } while (!str.isEmpty());
    }
}
