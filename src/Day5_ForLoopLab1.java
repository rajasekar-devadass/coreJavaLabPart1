/**
 * Print 10 numbers using for loop
 */
public class Day5_ForLoopLab1 {
    public static void main(String[] args) {

        //For Loop implementation
        System.out.println("For loop implementation");
        for (int counter = 1; counter <= 10; counter++) {
            System.out.print(counter + " ");
        }
        System.out.println("\n");

        //While Loop implementation
        System.out.println("While loop implementation");
        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++; //counter = counter + 1;
        }
    }
}
