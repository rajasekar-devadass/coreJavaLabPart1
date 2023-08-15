import java.util.Scanner;

/**
 * Program to calculate total and average of a student marks in given subjects
 * Student has many subjects
 * Receive the no of subjects
 * Receive the score for all the given number of subjects from the user
 * Print the scores received from the user
 * Calculate and print the total and average of the student marks.
 */
public class Day6_ArrayLab6UserInput {
    public static void main(String[] args) {

        int total = 0;
        double average = 0;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the total numbers of subjects");
        int totalSubjects = inputScanner.nextInt();

        //Create an array to all the subject scores
        int[] scores = new int[totalSubjects];

        //Receive the subject scores from the user
        for (int counter = 0; counter < totalSubjects; counter++) {
            System.out.println("Enter subject score" + (counter + 1)); //Not incrementing the counter, just printing the counter +1 value
            scores[counter] = inputScanner.nextInt();
            //total += scores[counter]; // This could be done here itself, But to demonstrate the array access, this has been moved to a separate for loop
        }

        //Iterate through the array and calculate the total and average
        for (int score : scores) {
            total += score; // total = total + score;
        }

        average = total / ((double) scores.length);
        System.out.println("total: " + total);
        System.out.println("average:" + average);
    }
}
