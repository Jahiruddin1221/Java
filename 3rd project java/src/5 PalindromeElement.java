import java.util.Scanner;

 class PalindromeElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many element you want: ");
        int num = input.nextInt();
        int[] ele = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter the array element:" + (i+1) + " ");
            ele[i] = input.nextInt();

        }
        System.out.println("\nYour original value are");
        for (int i = 0; i < num; i++) {
            System.out.print(ele[i] + " ");
        }
        int i, j;
        for (i = 0, j = num-1; i <= j; i++, j--) {
            if (ele[i] != ele[j]) {
                System.out.println("\nyour number is not palindrome");
                break;
            }

            }
        if (i > j) {
            System.out.println("Your number is palindrome");
        }

    }
}
