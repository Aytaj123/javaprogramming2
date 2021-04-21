package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
    displayMessage(); //call the method - 1st call to the method
        displayMessage(); // 2nd call to the method
        displayMessage(); // 3rd call to the method. we can do it more

        for (int i = 1; i <= 100; i++) {
            System.out.print(i +" - ");
            displayMessage();
        }

    }
    //our first reusable method
    public static void displayMessage() {
        System.out.println("Hello B22 friends!");
    }
}
