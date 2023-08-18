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

//        Modify it
        marks[0] = 100;
        System.out.println("\nFirst Element after modifying: " + marks[0]);

        //print using for loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println("value at index " + i + " is" + marks[i]);
        }
        System.out.println();

        //subtract the value of each element by last element
        //This is To show how array elements can be utilised
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] - marks[marks.length - 1];
        }
        System.out.println();

//        print using for Each loop
        for (int value : marks) {
            System.out.println("value is " + value);
        }
    }
}
