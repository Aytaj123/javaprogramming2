package day28_loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHKJLMNOPQRSTUVWXYZabcdefgkjlmnopqrstuvwxyz4124247981_!@#$%^&*";
        Random random = new Random();
        String password = "";

        for (int i = 1; i <= 8; i--) {
            int index = random.nextInt(71);
            System.out.println(source.charAt(index));
            //System.out.println(random.nextInt(source.length()));
            password += source.charAt(index);
            System.out.println("\nYour password is: "+ password);
        }
        //main(null);

    }
}
