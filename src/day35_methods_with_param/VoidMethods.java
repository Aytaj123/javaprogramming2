package day35_methods_with_param;

public class VoidMethods {
    public static void main(String[] args) {
        printAtoZ();
        printAtoZ();
        //displayUSFlag();
    }

    public static void printAtoZ() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i + " ");
        }
        System.out.println();


    }
}
