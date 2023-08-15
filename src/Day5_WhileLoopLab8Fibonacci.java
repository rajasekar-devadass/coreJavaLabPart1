/**
 * Java program to print the given fibonacci series
 */
public class Day5_WhileLoopLab8Fibonacci {
    public static void main(String[] args) {
        int count = 10;

        int prev = 0, curr = 1;
        System.out.print(prev + " " + curr + " ");
        while (count > 2) {
            int next = prev + curr;
            System.out.print(next + " ");
            prev = curr;
            curr = next;
            count--;
        }
        System.out.println();
    }
}
