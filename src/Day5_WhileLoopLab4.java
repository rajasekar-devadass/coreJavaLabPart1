/**
 * Print 10 numbers using while loop
 */
public class Day5_WhileLoopLab4 {
    public static void main(String[] args) {
        //Variation 1
        System.out.println("Variation 1");
        int counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++; //counter = counter + 1;
        }
        System.out.println("\n");

        //Variation 2
        System.out.println("Variation 2");
        counter = 1;
        while (counter <= 10) {
            System.out.print((counter++) + " ");
        }
        System.out.println("\n");


        //Variation 3
        System.out.println("Variation 3");
        counter = 0;
        while (counter < 10) {
            System.out.print((++counter) + " ");
        }

    }
}
