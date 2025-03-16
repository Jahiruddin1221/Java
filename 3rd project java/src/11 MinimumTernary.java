import java.util.Scanner;

 class MinimumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();

        MinimumTernary ternary = new MinimumTernary();       // also static method
        int result = ternary.min(num1, num2);
        System.out.println("Minimum number is " + result);

    }
    public int min(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
        }
    }
