package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'l';
        int index = -1;

        for (int n = 0; n < word.length(); n++) {
            //System.out.println("Matches");
            if (word.charAt(n) == letter) {
                index = n;
                System.out.println(letter +" is found at index "+ index);
            }
        }

        if (index == -1) {
            System.out.println(letter +" letter is not present");
        }
    }
}
