import java.util.Scanner;

/**
 * Program to find greatest of 3 numbers
 * There will not be duplicate numbers
 */
public class Day4_ControlFlowLab7Greatest3 {
    public static void main(String[] args) {
        int score1 = 11, score2 = 80, score3 = 90;

        if (score1 > score2 && score1 > score3) {
            System.out.println("score1 is greatest :" + score1);
        } else if (score2 > score3) {
            System.out.println("score2 is greatest :" + score2);
        } else {
            System.out.println("score3 is greatest :" + score3);
        }

    }
}
