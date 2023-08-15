public class Day6_ArrayMultiDimLab2 {
    public static void main(String[] args) {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7}
        };
        for (int mainArrIndex = 0; mainArrIndex < data.length; ++mainArrIndex) {
            for (int childArrIndex = 0; childArrIndex < data[mainArrIndex].length; ++childArrIndex) {
                System.out.print(data[mainArrIndex][childArrIndex] + ",\t");
            }
            System.out.println();
        }
    }
}
