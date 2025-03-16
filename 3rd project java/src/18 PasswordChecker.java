import java.util.Scanner;

 class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password;
        do {
            System.out.print("Enter a password: ");
            password = input.nextInt();
        } while (!isValidPassword(password));
        System.out.println("Thanks for entering a valid password");

    }
    public static boolean isValidPassword(int password) {

        return password > 6;
    }
}
