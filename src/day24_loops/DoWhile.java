package day24_loops;

public class DoWhile {
    public static void main(String[] args) {

        String word = "java";
        int a = 0;
        do {
            System.out.println(word.charAt(a));
            a++;

        } while (a > word.length());


    }
}
