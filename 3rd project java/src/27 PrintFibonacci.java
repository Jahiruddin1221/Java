import java.util.Scanner;

class PrintFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to know: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {

            System.out.print(fibonacci(i) + " ");
        }

    }
    public static int fibonacci(int num) {
        if (num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }
}
