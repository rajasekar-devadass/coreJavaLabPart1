import java.util.Scanner;

/**
 * Day2_VariablesLab1
 * Program to Find the largest number in the array
 */
public class Day6_ArrayLab4GreatestNumInput {
    public static void main(String[] args) {

        System.out.println("Enter the no of inputs");
        Scanner inputScanner = new Scanner(System.in);
        int noOfElements = inputScanner.nextInt();
        int[] numbers = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            System.out.println("Enter the value");
            numbers[i] = inputScanner.nextInt();
        }

        int maxElement = numbers[numbers.length - 1];
        for (int index = numbers.length - 2; index >= 0 ; index--) {
            if (numbers[index] > maxElement) {
                maxElement = numbers[index];
            }
        }
        System.out.println("Max Element is " + maxElement);
        inputScanner.close();
    }
}
