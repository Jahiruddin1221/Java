import java.util.Scanner;

public class PositiveNegative {
    /*Create a program that determines if a number is positive, negative, or zero.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: " );
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Your number is positive");
        } else if (num == 0) {
            System.out.println("Your number is zero");
        } else {
            System.out.println("Your number is negative");
        }
    }
}
