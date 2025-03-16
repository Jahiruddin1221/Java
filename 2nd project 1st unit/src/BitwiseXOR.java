import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        /*Create a program that shows bitwise XOR of two numbers.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Please enter your second number: ");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("Your result is " +result);

    }
}
