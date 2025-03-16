import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        /*Create a program that shows bitwise compliment of a number.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Your result " + result);
    }
}
