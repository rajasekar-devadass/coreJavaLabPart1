import java.util.Scanner;

/**
 * receive input 1 to 5 from user, break if the input is not in correct sequence
 */
public class Day5_WhileLoopLab6Break {
    public static void main(String[] args) {

        int counter = 1;
        System.out.println("Enter numbers from 1 to 5 in correct order");
        Scanner inputScanner = new Scanner(System.in);
        while (counter <= 5) {
            int userInput = inputScanner.nextInt();
            if (userInput != counter) {
                break;
            }
            counter++; //counter = counter + 1;
        }
        inputScanner.close();
    }
}
