public class Day2_VariablesLab2 {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 20, 8, 15};

        //Variables - Named Memory Locations
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest) {
                //does not handle duplicate
                secondLargest = num;
            }
        }
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("There is no second largest number.");
        }
    }
}
