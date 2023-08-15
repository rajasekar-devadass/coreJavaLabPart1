public class Day6_ArrayLab1 {
    public static void main(String[] args) {
        // create an array
        int[] marks = {90, 97, 95, 99, 100};

        System.out.println("Array size" + marks.length);

        // access each array elements
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + marks[0]);
        System.out.println("Second Element: " + marks[1]);
        System.out.println("Third Element: " + marks[2]);
        System.out.println("Fourth Element: " + marks[3]);
        System.out.println("Fifth Element: " + marks[4]);

        //Modify it
        marks[0] = 10;
        System.out.println("\nFirst Element after modifying: " + marks[0]);
    }
}
