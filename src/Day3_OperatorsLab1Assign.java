public class Day3_OperatorsLab1Assign {
    public static void main(String[] args) {
        // declare variables
        int a = 12, b = 5;

        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));

        // Increment operator - POST
        System.out.println("a++ = " + (a++)); //output 12

        // Increment operator - PRE
        System.out.println("++a = " + (++a)); //output 14

        // Decrement operator - POST
        System.out.println("b-- = " + (b--)); //output 5

        // Increment operator - PRE
        System.out.println("--b = " + (--b)); //output 3
    }
}
