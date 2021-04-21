package day33_arrays;
import java.util.*;
public class MultiDArrayExample {
    public static void main(String[] args) {
        String [] [] users = new String [3] [2]; // 3 users and 2 passwords
        users [0][0] = "Teodora Tsvetanov";
        users [0][1] = "TeodorasPWD12";
        users [1][0] = "Anna Ziyayeva";
        users [1][1] = "AnnaAlmaty123";
        users [2][0] = "Aytaj Kareem";
        users [2][0] = "AytajBaku123";

        String [] [] userData = { {"Teodora Tsvetanov" , "TeodorasPWD12",
                             "Anna Ziyayeva" , "AnnaAlmaty123",
                               "Aytaj Kareem" , "AytajBaku123" } };

        System.out.println(userData[0][1]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][1]);

        System.out.println(Arrays.deepToString(userData) );
    }
}
