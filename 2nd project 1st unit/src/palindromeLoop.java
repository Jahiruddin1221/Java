import java.util.Scanner;

public class palindromeLoop {
    public static void main(String[] args) {
        /* Create a program to verify if a number is a palindrome(123321).*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        reverse(num);

    }
    public static int reverse(int num) {
        int store, newNum = 0;
        store = num;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        if (store == newNum) {
            System.out.println("Your number is a palindrome number");
        } else {
            System.out.println("Your number is not a palindrome number");
        }
        return 0;

    }

}
