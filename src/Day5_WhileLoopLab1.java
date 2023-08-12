import java.util.Scanner;

/**
 * Adding a continuous loop
 * Adding a menu item for the user to exit the loop
 */
public class Day5_WhileLoopLab1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int userSelection;
        boolean continueExecution = true;
        while (continueExecution) {

            System.out.println("\nChoose from the menu");
            System.out.println("\tEnter 1 for addition");
            System.out.println("\tEnter 2 for Subtraction");
            System.out.println("\tEnter 3 for Multiplication");
            System.out.println("\tEnter 4 for Division");
            System.out.println("\tEnter -1 to exit");
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
                case -1: {
                    System.out.println("\nExiting the loop based on user request");
                    continueExecution = false;
                    break;
                }
                default:
                    System.out.println("Invalid Menu choice");
            }
        }
        inputScanner.close();

    }
}
