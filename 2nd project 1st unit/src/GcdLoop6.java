import java.util.Scanner;

public class GcdLoop6 {
    public static void main(String[] args) {
        /* Create a program to find the Greatest Common Divisor (GCD) of two integers.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter your second number: ");
        int second = input.nextInt();
        int result = gcdTable(first, second);
        System.out.println("Your GCD is " + result);

    }
    public static int gcdTable(int num1, int num2) {
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }

    }
}
