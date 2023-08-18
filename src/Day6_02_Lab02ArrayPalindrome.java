/**
 * Program to find if an array is palindrome
 */
public class Day6_02_Lab02ArrayPalindrome {
    public static void main(String[] args) {


        int[] inputArray = new int[]{4, 5, 6, 7, 6, 5, 4}; //odd number - palindrome
//        int[] inputArray = new int[]{4, 5, 6, 7, 7, 6, 5, 4}; //Even number - palindrome
//
//        int[] inputArray = new int[]{4, 5, 6, 7, 7, 5, 4}; //odd number - palindrome
//        int[] inputArray = new int[]{4, 5, 6, 7, 8, 6, 5, 4}; //Even number - palindrome

        int left=0;
        int right = inputArray.length -1;

        boolean isPalindrome = true;
        while(left < right){
            if(inputArray[left] != inputArray[right]){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is Not a palindrome");
        }
    }
}
