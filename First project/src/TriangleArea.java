import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        /*Create a program to calculate the Area of a Triangle.
        Area of triangle = ½*B*H */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the height: ");
        int H = input.nextInt();
        System.out.print("Please enter the bass: ");
        int B = input.nextInt();

        double result =0.5 * (B * H);
        System.out.println("The area of triangle is " + result);
    }
}
