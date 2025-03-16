import java.util.Scanner;

public class FibonacciLoop {
    public static void main(String[] args) {
        /*Create a program to print the Fibonacci series up to a certain number.
          (15--1,2,3,5,8,13)*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        printFibonacci(num);
        random(num);

    }
    public static int printFibonacci(int num) {

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
        return 0;
    }
    public static int random(int num) {
        if (num <= 0) {
            System.out.println("Your number is invalid please enter more than 0");
        }
        return 0;
    }
}
