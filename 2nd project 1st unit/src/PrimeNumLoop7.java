import java.util.Scanner;

public class PrimeNumLoop7 {
    public static void main(String[] args) {
        /*Create a program to check whether a given number is prime. */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);

        if (isPrime) {
            System.out.println("Your number is prime");
        } else {
            System.out.println("Your number is not a prime");
        }

    }
    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
