import java.util.Scanner;

public class FactorialLoop3 {
    public static void main(String[] args) {
        /*Write a function that calculates the factorial of a given number.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Your factorial is " + fact);

    }
    public static long factorial(int num) {
        if (num < 2) {
            return 1;
        }
        int fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
