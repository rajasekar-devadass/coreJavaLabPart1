public class Day6_ArrayLab3ForEachLoop {
    public static void main(String[] args) {
        // create an array
        int[] marks = {90, 97, 95, 99, 100};

        System.out.println("Array size: " + marks.length);

        // access each array elements
        System.out.println("Accessing Elements of Array:");
        for(int mark : marks){
            System.out.println(mark);
        }
        //Modify it
        marks[0] = 10;
        System.out.println("\nFirst Element after modifying: " + marks[0]);
    }
}
