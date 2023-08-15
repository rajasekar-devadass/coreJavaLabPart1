public class Day7_MethodLab5ReturnInt {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int sum = printSquaredSumOfTwoNumbers(a, b);
        System.out.println("Sqaured Sum of 2 numbers : " + sum);
    }

    public static int printSquaredSumOfTwoNumbers(int a, int b) {
        a *= a;
        b *= b;
        return a + b;
    }
}
