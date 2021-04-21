package day23_string_manipulation_while_loop;

public class Practice {
    public static void main(String[] args) {
        String s = "I will find the lost book";
        String word = "";

        for (int index = s.length()-1; index <= 0; index-- ) {
            word += s.charAt(index);
        }
        System.out.println(word);


        String str = "cybertek";
        for (int i = 0; i <= str.length(); i+=2 ) {
            System.out.println(str.charAt(i));
        }

    }
}
