/**
 * Write a program to find average.
 * 1. There are 4 students
 * 2. Each student has 2 subjects scores
 * 3. Find the average of 2 subjects scores and print it for all students
 */
public class Day6_ArrayMultiDimLab4 {
    public static void main(String[] args) {
//        totalNoOfStudents = 4;
//        totalNoOfSubjects = 3;

        int[][] scores = new int[][]{
                {10, 40, 70}, //Each student scores
                {20, 50, 80},
                {25, 55, 85},
                {30, 60, 90}
        };
        int[] allStudentTotalScores = new int[scores.length];

        for (int studentIndex = 0; studentIndex < scores.length; studentIndex++) {
            System.out.println("Calculating Total & average of student " + studentIndex);
            for (int scoreIndex = 0; scoreIndex < scores[studentIndex].length; scoreIndex++) {
                allStudentTotalScores[studentIndex] += scores[studentIndex][scoreIndex];
            }
            System.out.println("Total score of student " + studentIndex + " : " + allStudentTotalScores[studentIndex]);
            System.out.println("Average is " + (allStudentTotalScores[studentIndex] / (double) scores[studentIndex].length));
        }

    }
}
