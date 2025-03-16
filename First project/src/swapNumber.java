import java.util.Scanner;

public class swapNumber {
    public static void main(String[] args) {
        /*Create a program to swap two numbers*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter value of A: ");
        int a = input.nextInt();
        System.out.print("Please enter value of B: ");
        int b = input.nextInt();

        int c = a;
            a = b;
            b = c;

        System.out.println("\nSwapping done.....");
        System.out.println("Value of A is " + a);
        System.out.print("Value of B is " + b);
    }
}
