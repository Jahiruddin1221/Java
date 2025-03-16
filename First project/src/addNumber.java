import java.util.Scanner;

public class addNumber {
    public static void main(String[] args) {
        /*Create a program that takes two numbers and shows result of
        all arithmetic operators (+,-,*,/,%).*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int firstNum = input.nextInt();
        System.out.print("Now, enter your second number: ");
        int secondNum = input.nextInt();

        System.out.println("Your addition is " + (firstNum + secondNum));
        System.out.println("Your subtraction is " + (firstNum - secondNum));
        System.out.println("Your multiplication is " + (firstNum * secondNum));
        System.out.println("Your division is " + (firstNum / secondNum));
        System.out.println("Your modulus is " + (firstNum % secondNum));
    }
}
