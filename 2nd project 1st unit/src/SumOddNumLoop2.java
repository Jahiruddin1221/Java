import java.util.Scanner;

public class SumOddNumLoop2 {
    public static void main(String[] args) {
        /*Create a program to sum all odd numbers from 1 to a specified number N.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int sum = sumOddNumbers(num);
        System.out.println("Your OddSum " + num + " is " + sum);
    }
    public static int sumOddNumbers(int num) {
      int sum = 0;
      int i = 1;
      while (i <= num) {
          sum += i;
        //  System.out.println("Your OddSum " + num + " is " + sum);
          i += 2;

      }
      return sum;

    }
}
