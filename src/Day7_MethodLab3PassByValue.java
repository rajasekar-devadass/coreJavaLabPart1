public class Day7_MethodLab3PassByValue {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println("Value of a before passing to add method: " + a);
        System.out.println("Value of b before passing to add method: " + b);
        printSquaredSumOfTwoNumbers(a, b);
        System.out.println("Value of a after passing to add method: " + a);
        System.out.println("Value of b after passing to add method: " + b);
    }

    public static void printSquaredSumOfTwoNumbers(int a, int b) {
        a *= a;
        b *= b;
        System.out.println("Sqaured Sum of 2 numbers : " + (a + b));
    }
}
