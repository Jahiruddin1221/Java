import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        /*Create a program to calculate Perimeter of a rectangle.
        Perimeter of rectangle ABCD = A+B+C+D */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length: ");
        int length = input.nextInt();
        System.out.print("Please enter the width: ");
        int width = input.nextInt();

        int len = length * 2;
        int wid = width * 2;
        int result = len + wid;


        System.out.println("Your total length is " + len + " and total width is " + wid +
                " and your Perimeter of rectangle is " + result);

    }
}
