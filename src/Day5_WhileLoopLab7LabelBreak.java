import java.util.Scanner;

/**
 * receive input 1 to 5 from user, break if the input is not in correct sequence
 */
public class Day5_WhileLoopLab7LabelBreak {
    public static void main(String[] args) {

        int counter = 1;
        System.out.println("Enter numbers from 1 to 5 in correct order");
        Scanner inputScanner = new Scanner(System.in);
        OuterLoop:
        {
            System.out.println("Entering OuterLoop");
            InnerLoop: {
                System.out.println("Entering Inner Loop");
                System.out.println("Enter a number");
                int userDecision = inputScanner.nextInt();
                if(userDecision > 0){
                    System.out.println("breaking the outer loop");
                    break OuterLoop;
                }
                System.out.println("Exiting Inner Loop");
            }
            System.out.println("Exiting Outer Loop");
        }
        inputScanner.close();
        System.out.println("End of Application");
    }
}
