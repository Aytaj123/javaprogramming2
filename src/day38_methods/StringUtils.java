package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(hello) = " + isNullOrEmpty("hello"));
        String word = "hello";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        String str = "";
    }

    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }


    public static void reverse(String str) {
        String reversed = "";
        for (int i = str.length(); i >= 0; i--) {
            reversed += str.charAt(i);
        }

        //return reversed;
    }
}


