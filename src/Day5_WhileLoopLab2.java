import java.util.Scanner;

/**
 * Run the loop for given number of times
 */
public class Day5_WhileLoopLab2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        //To control the no of times of execution
        int maxAttempt = 3;

        int userSelection;
        while (maxAttempt > 0) {

            System.out.println("\nChoose from the menu");
            System.out.println("\tEnter 1 for addition");
            System.out.println("\tEnter 2 for Subtraction");
            System.out.println("\tEnter 3 for Multiplication");
            System.out.println("\tEnter 4 for Division");
            userSelection = inputScanner.nextInt();

            switch (userSelection) {
                case 1: {
                    System.out.println("Enter the two numbers to add");
                    double a = inputScanner.nextDouble();
                    double b = inputScanner.nextDouble();
                    System.out.println("Answer : " + (a + b));
                    break;
                }
                case 2: {
                    System.out.println("Enter the two numbers to subtract");
                    double a = inputScanner.nextDouble();
                    double b = inputScanner.nextDouble();
                    System.out.println("Answer :" + (a - b));
                    break;
                }
                case 3: {
                    System.out.println("Enter the two numbers to multiply");
                    double a = inputScanner.nextDouble();
                    double b = inputScanner.nextDouble();
                    System.out.println("Answer :" + (a * b));
                    break;
                }
                case 4: {
                    System.out.println("Enter the two numbers to divide");
                    double a = inputScanner.nextDouble();
                    double b = inputScanner.nextDouble();
                    System.out.println("Answer :" + (a / b));
                    break;
                }
                default:
                    System.out.println("Invalid Menu choice");
            }
            maxAttempt--; //maxAttempt = maxAttempt - 1;
        }
        inputScanner.close();

    }
}
