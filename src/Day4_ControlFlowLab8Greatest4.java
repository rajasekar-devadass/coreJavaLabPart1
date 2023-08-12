/**
 * Program to find greatest of 4 numbers
 * There will not be duplicate numbers
 */
public class Day4_ControlFlowLab8Greatest4 {
    public static void main(String[] args) {
        int score1 = 11, score2 = 2, score3 = 3, score4 = 4;

        System.out.println("Variation 1");
        int greatest;
        if (score1 >= score2 && score1 >= score3 && score1 >= score4) {
            greatest = score1;
        } else if (score2 >= score1 && score2 >= score3 && score2 >= score4) {
            greatest = score2;
        } else if (score3 >= score1 && score3 >= score2 && score3 >= score4) {
            greatest = score3;
        } else {
            greatest = score4;
        }
        System.out.println(greatest);


        System.out.println("Variation 2");
        int greatestInTeamA;
        int greatestInTeamB;
        if (score1 > score2) {
            greatestInTeamA = score1;
        } else {
            greatestInTeamA = score2;
        }
        if (score3 > score4) {
            greatestInTeamB = score3;
        } else {
            greatestInTeamB = score4;
        }
        if (greatestInTeamA > greatestInTeamB) {
            System.out.println(greatestInTeamA);
        } else {
            System.out.println(greatestInTeamB);
        }

        
        System.out.println("Variation 3");
        greatest = score1;
        if (score2 > greatest) {
            greatest = score2;
        }
        if (score3 > greatest) {
            greatest = score3;
        }
        if (score4 > greatest) {
            greatest = score4;
        }
        System.out.println(greatest);

    }
}
