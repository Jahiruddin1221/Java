import java.util.Scanner;

 class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5, guess;
        do {
            System.out.print("Enter a number between 0 and 10: ");
            guess = input.nextInt();
        } while (num != guess);
        System.out.println("Your guessed number is match");
    }
}