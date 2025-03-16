import java.util.Scanner;

public class ReverseLoop8 {
    public static void main(String[] args) {
        /* Create a program to reverse the digits(235--532) of a number.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int result = reverse(num);
        System.out.println("Your reverse value is " +result);

    }
    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }

}
