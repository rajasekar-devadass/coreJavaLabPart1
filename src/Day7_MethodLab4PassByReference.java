public class Day7_MethodLab4PassByReference {
    public static void main(String[] args) {
        int[] inputArray = new int[]{1, 2, 3, 4};
        printArray(inputArray);
        squareTheNumbers(inputArray);
        printArray(inputArray);
    }
    public static void squareTheNumbers(int[] inputArray) {
        for (int index = 0; index < inputArray.length; index++) {
            inputArray[index] *= inputArray[index];
        }
    }
    public static void printArray(int[] inputArray) {
        for (int index = 0; index < inputArray.length; index++) {
            System.out.print(inputArray[index] + "\t");
        }
        System.out.println();
    }
}
