import java.util.Scanner;

class GuessingGame {
    int random;
    GuessingGame() {
        random = (int) Math.ceil(Math.random() * 100);  // 0 - 100 random number

        }
    /**
     * @param guessNumber the number that player guessed
     * @return
     * - Negative if the guessed number is smaller
     * - 0 if th guessed number is correct.
     * - Positive if the guessed number is higher.
     */
    int guess(int guessNumber) {            // Higher or Lower
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        int num;
        int result;
        do {
            System.out.print("Guess the number: ");
            num = input.nextInt();
            result = game.guess(num);
            if (result == 0) {
                System.out.println("Your guess number is correct");
            } else if (result < 0) {
                System.out.println("Please guess a higher number");
            } else {
                System.out.println("Please guess a lower number");
            }
        } while (result != 0);

    }
}
