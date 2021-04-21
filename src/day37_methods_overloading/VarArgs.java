package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(100, 200, 300);
        addNumbers(23, 45, 17, 3, 7, 54, 98, 2, 13, 3, 65, 76, 4, 16, 5, 24); // it's thanks to ... (unlimited)
        addNumbers();
    }

    public static void addNumbers (int...nums ) {
        int sum = 0;

        for (int n : nums) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
