public class Day6_02_Lab05Array2DDiagonalSum {
    public static void main(String[] args) {


        int[][] inputArray = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        for (int row = 0; row < inputArray.length; row++) {
            //with duplication middle element
            // sum += inputArray[row][row] + inputArray[row][inputArray.length - 1 - row];

            //without duplicating middle element
            if (row == inputArray.length - 1 - row) {
                sum += inputArray[row][row];
            } else {
                sum += inputArray[row][row] + inputArray[row][inputArray.length - 1 - row];
            }
        }
        System.out.println(sum);
    }
}
