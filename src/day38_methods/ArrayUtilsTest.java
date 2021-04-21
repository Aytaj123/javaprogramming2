package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int [] nums = {5, 23, 1, 543, 90};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int [] {23,43, 7, 8, 91, 12, 15, 26});

        System.out.println("sum = " + ArrayUtils.sum(nums));
        System.out.println("sum = " + ArrayUtils.sum(new int [] {23,43, 7, 8, 91, 12, 15, 26}));

        int [] nums2 = {3, 5, 42, 34, 17, 1};
        int num = 5;
       // boolean result = false;
        //for (int each : nums2) {
          //  if (each == num) {
            //    result = true;
              //  break;
           // }
        //}
        System.out.println("result = " + ArrayUtils.contains(nums2, 5));
        System.out.println("result = " + ArrayUtils.contains(nums2, 42));
        System.out.println("result = " + ArrayUtils.contains(nums2, 7));


    }


}
