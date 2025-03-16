import java.util.Scanner;

public class MarksGrades {
    public static void main(String[] args) {
        /*Create a program that calculates grades based on marks
        A -> above 90%
        B -> above 75%
        C -> above 60%
        D -> above 30%
        F -> below 30% */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your marks: ");
        int mark = input.nextInt(); 

        if (mark >= 90) {
            System.out.println("You have got A");
        } else if (mark >= 75) {
            System.out.println("You have got B");
        } else if (mark >= 60) {
            System.out.println("You have got C ");
        } else if (mark >= 30) {
            System.out.println("You have got D");
        } else  {
            System.out.println("You have got 'F' and you are fail");
        }
    }
}
