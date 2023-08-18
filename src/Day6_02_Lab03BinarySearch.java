/**
 * Program to find the first occurrence of a number in a SORTED array.
 * Print the index of the element otherwise print -1
 */
public class Day6_02_Lab03BinarySearch {
    public static void main(String[] args) {

        int[] inputArray = new int[]{10, 12, 15, 20, 29, 31, 44};

        int expectedNumber = 31;

        int elementFoundAtIndexPosition = -1;

        int left = 0;
        int right = inputArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("\nleft - " + left);
            System.out.println("mid - " + mid);
            System.out.println("right - " + right);

            if (inputArray[mid] == expectedNumber) {
                elementFoundAtIndexPosition = mid;
                break;
            } else if (inputArray[mid] < expectedNumber) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Found the number at index : " + elementFoundAtIndexPosition);
    }
}