import java.util.Scanner;
import java.util.SortedMap;

public class GreatestNumber {
    public static void main(String[] args) {
        /*Create a program that determines the greatest of the three numbers.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter your second number: ");
        int second = input.nextInt();
        System.out.print("enter your third number: ");
        int third = input.nextInt();

       if (first >= second && first >= third) {
           System.out.println("Your greatest value is " + first);
       } else if (second >= third) {
           System.out.println("Your greatest value is " + second);
       } else {
           System.out.println("Your greatest value is " + third);
       }
    }
}
