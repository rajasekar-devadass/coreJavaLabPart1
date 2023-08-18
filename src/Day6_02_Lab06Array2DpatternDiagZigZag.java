/**
 * Program to print NxN matrix in cross zigZag along the diagonal
 * Output of {{1,2,3}, {4,5,6}, {7,8,9}} should be 1 2 4 7 5 3 6 8 9
 */
public class Day6_02_Lab06Array2DpatternDiagZigZag {
    public static void main(String[] args) {


        int[][] inputArray = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rowLen = inputArray.length - 1;
        int colLen = inputArray.length - 1;

        int row = 0;
        int col = 0;

        for (int diag = 0; diag < (rowLen + colLen + 1); diag++) {
            if (diag % 2 == 0) { // Even rows: left to right
                for (; row >= 0 && col <= colLen; row--, col++) {
                    if (row <= rowLen && col >= 0) {
                        System.out.print(inputArray[row][col] + " ");
                    }
                }
                row++;
                System.out.println();
            } else { // Odd rows: right to left
                for (; row <= rowLen && col >= 0; row++, col--) {
                    if (row >= 0 && col <= colLen) {
                        System.out.print(inputArray[row][col] + " ");
                    }
                }
                col++;
                System.out.println();
            }
        }
    }
}
