/**
 * Day2_VariablesLab1
 * Program to Find the largest number in the array
 */
public class Day6_ArrayLab4GreatestNum {
    public static void main(String[] args) {
        int[] numbers = new int[]{11, 2, 3, 4, 5, 20};

        int maxElement = numbers[0];
        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] > maxElement) {
                maxElement = numbers[index];
            }
        }
        System.out.println(maxElement);
    }
}
