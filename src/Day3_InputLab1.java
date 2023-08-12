import java.util.Scanner;

public class Day3_InputLab1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = inputScanner.nextInt();
        System.out.println("You entered " + number);

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = inputScanner.nextFloat();
        System.out.println("Float entered = " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = inputScanner.nextDouble();
        System.out.println("Double entered = " + myDouble);

        // Getting String input
        System.out.print("Enter text: ");
        System.out.println("Text entered = " + inputScanner.next());

        // closing the scanner object to release the resource
        inputScanner.close();
    }
}
