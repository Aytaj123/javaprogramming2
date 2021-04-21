package day38_methods;

public class ArrayUtils {
    public static void printArray(int [] nums) {
        for (int each : nums) {
            System.out.print(each +" ");
        }
        System.out.println();
    }

    public static int sum(int [] nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;
    }

    public static boolean contains(int [] nums, int num ) {
        boolean result = false;
        for (int each : nums) {
            if (each == num) {
                result = true;
                break;

            }
        }
        return result;

    }
}
