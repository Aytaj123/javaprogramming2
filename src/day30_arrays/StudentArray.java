package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
       // String[] student1 = {"1234","Aytaj","Kareem", "22", "4124247981" };
        String [] student1 = new String[5];
        student1[0] = "ID1234";
        student1[1] = "Aytaj";
        student1[2] = "Kareem";
        student1[3] = "22";
        student1[4] = "412-424-79-81";

        String[] student2 = {"ID4321", "Huseyn", "Kareem", "23", "412-419-76-07"};
        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstName = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2]);
        System.out.println("student1 batchNumber = " + student1[3]);
        System.out.println("student1 phoneNumber = " + student1[4]);

        System.out.println("student2 id = " + student2[0]);
        System.out.println("student2 firstName = " + student2[1]);
        System.out.println("student2 lastName = " + student2[2]);
        System.out.println("student2 batchNumber = " + student2[3]);
        System.out.println("student2 phoneNumber = " + student2[4]);

        System.out.println("student data length: " + student1.length);
        System.out.println("student data length: " + student2.length);

        if(student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");
        }

        if(student2.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");
        }

        //now we are comparing 2 students
        if(student1.length == student2.length) {
            System.out.println("PASS: data arrays length matches");
        } else {
            System.out.println("FAIL: data arrays length doesn't match");
        }

        //print first and last name in all uppercase
        //String[] student3 = {"Sophia", "Kareem"};
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        String phoneNumber = student1[4];
        System.out.println(phoneNumber.length());
        System.out.println(phoneNumber.startsWith("412"));








    }
}
