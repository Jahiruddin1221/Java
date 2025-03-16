import java.util.Scanner;

public class SumDigitLoop4 {
    public static void main(String[] args) {
        /*Create a program that computes the sum of the digits of an integer.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int result = sumOfDigit(num);
        System.out.println("Your sum of digit is " + result);
    }
    public static int sumOfDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;

    }
}
