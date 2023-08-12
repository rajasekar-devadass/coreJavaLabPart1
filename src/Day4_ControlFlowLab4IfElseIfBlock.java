/**
 * Program to find if score Grade A,B,C & Detained
 */
public class Day4_ControlFlowLab4IfElseIfBlock {
    public static void main(String[] args) {
        System.out.println("Find Grade");
        int input = 95;
        if (input >= 90) {
            System.out.println("GRADE A");
        } else if (input >= 70) {
            System.out.println("GRADE B");
        } else if (input >= 50) {
            System.out.println("GRADE C");
        } else {
            System.out.println("DETAINED");
        }
    }
}
