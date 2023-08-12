public class Day2_VariablesLab6CastingNarrow {
    public static void main(String[] args) {
        // Explicit Casting (Narrowing)
        double largeDouble = 12345.6789;

        // int intFromDouble = largeDouble;
        int intFromDouble = (int) largeDouble; // Explicit casting from double to int
        System.out.println("\nExplicit Casting:");
        System.out.println("double to int: " + intFromDouble);

        // Loss of Precision in Explicit Casting
        int largeInt = 1234567890;
        byte byteFromInt = (byte) largeInt; // Explicit casting from int to short
        System.out.println("\nLoss of Precision in Explicit Casting:");
        System.out.println("int to short: " + byteFromInt);
    }
}
