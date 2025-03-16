import java.util.Scanner;

public class LiftShift {
    public static void main(String[] args) {
        /*Create a program that shows use of left shift operator.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        int result = num << 4;
        System.out.println("Your result is " + result);
    }
}
