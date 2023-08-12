import java.util.Scanner;

public class Day3_InputLab2 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");

        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        // closing the scanner object to release the resource
        inputScanner.close();

        System.out.println("You entered " + number);

    }
}
