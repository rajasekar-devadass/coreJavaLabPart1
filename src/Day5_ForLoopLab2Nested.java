/**
 * Print 10 numbers using for loop for 10 times
 */
public class Day5_ForLoopLab2Nested {
    public static void main(String[] args) {

        System.out.println("For loop implementation");
        for (int outerLoopIndex = 1; outerLoopIndex <= 3; outerLoopIndex++) {
            for (int innerLoopIndex = 1; innerLoopIndex <= outerLoopIndex; innerLoopIndex++) {
                System.out.print(innerLoopIndex + "\t");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
