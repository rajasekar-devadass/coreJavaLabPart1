/**
 * Print 1 to 10 except number 5
 */
public class Day5_WhileLoopLab5Continue {
    public static void main(String[] args) {
        //Variation 1
        System.out.println("Variation 1");
        int counter = 1;
        while (counter <= 10) {
            if (counter == 5) {
                counter++;
                continue;
            }
            System.out.print(counter + " ");
            counter++; //counter = counter + 1;
        }
        System.out.println("\n");

        //Variation 2
        System.out.println("Variation 2");
        counter = 1;
        while (counter <= 10) {
            if (counter != 5) {
                System.out.print(counter + " ");
            }
            counter++; //counter = counter + 1;
        }
        System.out.println("\n");


    }
}
