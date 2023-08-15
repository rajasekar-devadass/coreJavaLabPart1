import java.util.Scanner;

public class Day7_MethodLab2 {
    public static void main(String[] args) {
        addTwoNumber();
    }

    public static void addTwoNumber() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        System.out.println("Sum of 2 numbers : " + (a + b));
        inputScanner.close();
    }
}
