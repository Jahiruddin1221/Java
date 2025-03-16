import java.util.Scanner;

public class LcmLoop5 {
    public static void main(String[] args) {
        /*Create a program to find the Least Common Multiple (LCM) of two numbers.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter your second number: ");
        int second = input.nextInt();
        int result = lcmTable(first, second);
        System.out.println("Lcm of two number is " + result);

    }
    public static int lcmTable(int first, int second) {
        int i = 1;
        while (i <= second) {
            int fact = first * i;
            if (fact % second == 0) {
                return fact;

            }
            i++;
        }
        return 0;
    }
}
