public class Day6_ArrayMultiDimLab5Dim3 {
    public static void main(String[] args) {
        int[][][] dim3Arr = new int[][][]{
                {
                    {1, 2}, {3, 4}
                },
                {
                    {5, 6}, {7, 8}
                },
        };
        for (int parentIndex = 0; parentIndex < dim3Arr.length; parentIndex++) {
            for (int firstChildIndex = 0; firstChildIndex < dim3Arr[parentIndex].length; firstChildIndex++) {
                for (int secondChildIndex = 0; secondChildIndex < dim3Arr[parentIndex][firstChildIndex].length; secondChildIndex++) {
                    System.out.print(dim3Arr[parentIndex][firstChildIndex][secondChildIndex] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
