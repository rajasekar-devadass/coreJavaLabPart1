/**
 * Java program to swap 2 numbers
 */
public class Day2_VariablesLab7Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Variation 1 - swapping with a temporary variable");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        System.out.println("\n\nVariation 2 - swapping without a temporary variable");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}
