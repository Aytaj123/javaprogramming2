package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String [] words = sentence.split(" ");
        //System.out.println(sentence.split(" ").wordsArray.replace(0,2));

        for (int i = words.length -1; i >= 0; i-- ) {
            System.out.println(words[i] + " ");
        }
    }
}
