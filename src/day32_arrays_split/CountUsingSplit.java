package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here";
        String[] catsArray = cats.split("cat");
        System.out.println("number of 'cat' = " + (catsArray.length - 1) );
    }
}
