public class Day2_VariablesLab5CastingWiden {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int intValue = 100;
        System.out.println("Original value: " + intValue);

        System.out.println();

        long longValue = intValue; // Implicit casting from int to long
        float floatValue = longValue; // Implicit casting from long to float
        double doubleValue = floatValue; // Implicit casting from float to double
        System.out.println("Implicit Casting:");
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);
    }
}
