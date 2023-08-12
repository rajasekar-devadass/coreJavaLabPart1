import java.util.Scanner;

/**
 * Program to find if given input is ODD or Even
 */
public class Day4_ControlFlowLab6OddEven {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = inputScanner.nextInt();

        if (userInput % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

    }
}
