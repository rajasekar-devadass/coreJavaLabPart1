public class Day6_02_Lab06Array2DpatternZigZag {
    public static void main(String[] args) {


        int[][] inputArray = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rows = inputArray.length;
        int cols = inputArray[0].length;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) { // Even rows: left to right
                for (int j = 0; j < cols; j++) {
                    System.out.print(inputArray[i][j] + " ");
                }
                System.out.println();
            } else { // Odd rows: right to left
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(inputArray[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
