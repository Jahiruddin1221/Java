import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        /* Create a program that determines if a number is odd or even.*/

        Scanner input =new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Your number is even");
        } else if (num < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number is odd");
        }
    }
}
