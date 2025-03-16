import java.util.Scanner;

public class ArmstrongLoop {
    public static void main(String[] args) {
        /*Create a program to check if a number is an Armstrong number.
        153*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        isArmstrong(num);


    }
    public static int isArmstrong(int num) {
        int store = 0;
        int c = num;
        while (num > 0) {
            int rem = num % 10;
            store = (rem * rem * rem) + store;
            num = num / 10;

        }
      if (c == store) {
          System.out.println("Your number is Armstrong");
      } else {
          System.out.println("Your number is nor a Armstrong");
      }
      return store;
    }

}
