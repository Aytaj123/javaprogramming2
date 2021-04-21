package day09_scanner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args) {
        int speedLimits = 55;
        int currentSpeed = 70;
        int overTheLimit = currentSpeed - speedLimits;
        System.out.println("You are driving " + overTheLimit + " mph over the limit. Slow down!");

    }
}
