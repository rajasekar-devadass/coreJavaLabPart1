import java.util.Scanner;

/**
 * receive input 1 to 5 from user, break if the input is not in correct sequence
 */
public class Day5_WhileLoopLab7CountDigits {
    public static void main(String[] args) {

        System.out.println("Enter a number to count its digits");
        Scanner inputScanner = new Scanner(System.in);
        int userInput = inputScanner.nextInt();
        int digitCounter = 0;
        int temp = userInput;
        while (temp > 0) {
            temp /= 10;//temp = temp / 10;
            digitCounter++;
        }
        System.out.println("Total no of digits in " + userInput + " is " + digitCounter);
        inputScanner.close();
    }
}
