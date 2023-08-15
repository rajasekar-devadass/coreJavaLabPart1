/**
 * Print 10 numbers using for loop
 */
public class Day5_ForLoopLab2 {
    public static void main(String[] args) {

        //For Loop implementation
        System.out.println("For loop implementation");
        for (int outerLoopIndex = 1; outerLoopIndex <= 10; outerLoopIndex++) {
            System.out.println("Starting Outer Loop Iteration - " + outerLoopIndex);
            for (int innerLoopIndex = 1; innerLoopIndex <= 10; innerLoopIndex++) {
                System.out.print(innerLoopIndex + "\t");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
