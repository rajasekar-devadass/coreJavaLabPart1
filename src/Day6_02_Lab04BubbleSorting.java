import java.util.Arrays;

/**
 * Program to find the first occurrence of a number in a SORTED array.
 * Print the index of the element otherwise print -1
 */
public class Day6_02_Lab04BubbleSorting {
    public static void main(String[] args) {

        int[] inputArray = new int[]{10, 52, 15, 20, 100};
//        int[] inputArray = new int[]{10, 52, 15, 20, 29, 31, 44};

        System.out.println("Before sorting");
        System.out.println(Arrays.toString(inputArray));

        int n = inputArray.length - 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
        }
        System.out.println("\n\nAfter sorting");
        System.out.println(Arrays.toString(inputArray));
    }
}