import java.util.Scanner;

public class MultiplicationTableLoop1 {
    public static void main(String[] args) {
        /*Develop a program that prints the multiplication table for a given number.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        printMultiplication(num);

    }
    public static void printMultiplication(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }

    }
}
