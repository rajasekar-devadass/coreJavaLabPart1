/**
 * Program to find the first occurrence of a number in unsorted array.
 * Print the index of the element otherwise print -1
 */
public class Day6_02_Lab01LinearSearch {
    public static void main(String[] args) {


        int[] inputArray = new int[]{10, 5, 6, 7, 38, 15, 4};

        int expectedNumber = 15;

        int elementFoundAtIndexPosition = -1;

        for (int index = 0; index < inputArray.length; index++) {
            if(inputArray[index] == expectedNumber){
                elementFoundAtIndexPosition = index;
                break;
            }
        }
        System.out.println("Found the number at index : " + elementFoundAtIndexPosition);
    }
}