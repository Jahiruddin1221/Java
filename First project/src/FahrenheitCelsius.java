import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        /*Create a program to calculate simple interest
        Simple Interest = (P x T x R)/100 */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the temp in F: ");
        float fah = input.nextFloat();

        float cel = (fah - 32) * 5 / 9;
        System.out.println("Your temperature in celsius is " + cel);
    }
}
