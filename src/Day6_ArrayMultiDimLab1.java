import java.util.Scanner;

/**
 * Program to calculate total and average of a 4 student and their marks in 3 subjects
 * There are 4 students
 * Each Student has 3 subjects
 * Calculate and print the total and average of the student marks.
 */
public class Day6_ArrayMultiDimLab1 {
    public static void main(String[] args) {
        //Variation 1
        int totalNoOfStudents = 4;
        int totalNoOfSubjects = 3;

        System.out.println("Variation 1");
        //The objective of this solution is to show the difficulty in manging complex data structure
        int[] allStudentScores1 = new int[]{10, 20, 25, 30};
        int[] allStudentScores2 = new int[]{40, 50, 55, 60};
        int[] allStudentScores3 = new int[]{70, 80, 85, 90};

        int[] allStudentTotalScores = new int[totalNoOfStudents];

        //Iterate through the array and calculate the total and average
        for (int studentIndex = 0; studentIndex < totalNoOfStudents; studentIndex++) {
            allStudentTotalScores[studentIndex] += allStudentScores1[studentIndex];
            allStudentTotalScores[studentIndex] += allStudentScores2[studentIndex];
            allStudentTotalScores[studentIndex] += allStudentScores3[studentIndex];

            //All the 3 subjects of students are added, Finding the average
            System.out.println("Total of student" + studentIndex + ": " + allStudentTotalScores[studentIndex]);
            double average = allStudentTotalScores[studentIndex] / ((double) totalNoOfSubjects);
            System.out.println("Average of student" + studentIndex + ": " + average);
        }
    }
}

