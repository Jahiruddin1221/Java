import java.util.Scanner;

class PrintEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i + " ");  // 01235
        }

    }
}
