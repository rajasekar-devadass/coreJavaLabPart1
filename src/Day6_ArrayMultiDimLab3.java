import java.util.Scanner;

/**
 * Program to calculate total and average of a 4 student and their marks in 3 subjects
 * There are 4 students
 * Each Student has 3 subjects
 * Calculate and print the total and average of the student marks.
 */
public class Day6_ArrayMultiDimLab3 {
    public static void main(String[] args) {
//        totalNoOfStudents = 4;
//        totalNoOfSubjects = 3;

        int[][] scores = new int[][]{
                {10, 20, 25, 30}, //Each subject scores of all students
                {40, 50, 55, 60},
                {70, 80, 85, 90}
        };

        int[] allStudentTotalScores = new int[scores[0].length]; //get total no of students

        //Iterate through the array and calculate the total and average
        for (int subjectScoreIndex = 0; subjectScoreIndex < scores.length; subjectScoreIndex++) {
            System.out.println("Capturing Subject " + subjectScoreIndex + " scores for all students");
            for (int studentIndex = 0; studentIndex < scores[subjectScoreIndex].length; studentIndex++) {
                allStudentTotalScores[studentIndex] += scores[subjectScoreIndex][studentIndex];
            }
        }

        for (int studentIndex = 0; studentIndex < allStudentTotalScores.length; studentIndex++) {
            System.out.println("Total score of student " + studentIndex + " : " + allStudentTotalScores[studentIndex]);
            System.out.println("Average is " + (allStudentTotalScores[studentIndex] / ((double) scores.length)));
        }

    }
}

