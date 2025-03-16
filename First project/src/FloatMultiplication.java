import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        /*Create a program to calculate product of two
        floating points numbers.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        float first = input.nextFloat();
        System.out.print("Now, Enter your second number: ");
        float second = input.nextFloat();

        float result = first * second;
        System.out.print("\n0.Your floating multiplication is " + result);

    }
}
