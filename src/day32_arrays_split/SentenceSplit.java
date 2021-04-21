package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String [] words = sentence.split(" ");
        System.out.println("First word = " + words[0]);
        System.out.println("Second word = " + words[1]);
        System.out.println("Third word = " + words[2]);
       // System.out.println("Fourth word = " + words[3]); out of bound

        for (String w : words) {
            System.out.println(w);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        System.out.println(googleResult.split(" ")[1] + " = result");
        System.out.println(googleResult.split(" ")[3].replace("("," ") + " = seconds");
    }
}
