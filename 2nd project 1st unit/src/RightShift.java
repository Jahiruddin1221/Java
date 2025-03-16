import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        /*Create a program that shows use of right shift operator.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("Your result is " + result);
    }
}
