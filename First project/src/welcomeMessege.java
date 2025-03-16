import java.util.Scanner;

public class welcomeMessege {
    /*Create a program to input name of the person and respond with
    "Welcome NAME to KG Coding"*/

    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = inout.nextLine();
        System.out.print("Welcome " + name + " to new language");


    }
}
