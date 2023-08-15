/**
 * Program to calculate total and average of a student marks in 3 subjects
 * Student has 3 subjects
 * Calculate the total and average of the student marks.
 */
public class Day6_ArrayLab5 {
    public static void main(String[] args) {
        int[] scores = new int[]{2, 1, 2};
        int total = 0;
        double average = 0;

        //Iterate through the array and calculate the total and average
        for (int counter = 0; counter < scores.length; counter++) {
            total += scores[counter]; // total = total + scores[counter];
        }

        average = total / ((double) scores.length);
        System.out.println("total: " + total);
        System.out.println("average:" + average);
    }
}
