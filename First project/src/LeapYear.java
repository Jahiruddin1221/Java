import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /*.Create a program that determines if a given year is a leap year
        (considering conditions like divisible by 4 but not 100, unless also divisible by 400).*/
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your year: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)) {
            System.out.println("Your year is a leap year");
        } else {
            System.out.println("Your year is not a leap year");
        }
    }
}
