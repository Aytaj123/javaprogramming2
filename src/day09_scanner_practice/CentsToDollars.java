package day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt();
        int dollars = 100;
        int remainingCents = cents % 100;
        System.out.println("remainingCents = " + remainingCents);
        System.out.println("in "+cents+" cents : "+dollars+" "+remainingCents+" cents");
    }
}
