import java.util.Scanner;

 class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        multiplication(num);
    }
    public static int multiplication(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
        return 0;

        }
    }
