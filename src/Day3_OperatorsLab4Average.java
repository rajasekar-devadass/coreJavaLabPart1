/**
 * java program to find the average of 3 subject scores of a student
 * All the input for the marks will be in the range of 0 to 100
 */
public class Day3_OperatorsLab4Average {
    public static void main(String[] args) {

        //Since score range in 0 to 100, byte data type is enough
        byte score1 = 25, score2 = 30, score3 = 40;

        //Fractional datatype double is required for division operation
        //Either of one value in the division should be floating point, hence 3.0 instead of 3
        double average = (score1 + score2 + score3) / 3.0;

        System.out.println("Average of 3 scores is : " + average);
    }
}
