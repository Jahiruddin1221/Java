import java.util.Scanner;

 class ReversElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many element you want: ");
        int num = input.nextInt();
        int[] ele = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter the array element:" + (i + 1) + " ");
            ele[i] = input.nextInt();
        }
        System.out.println("\nYour original value are");
        for (int i = 0; i < num; i++) {
            System.out.print(ele[i] + " ");
        }
        System.out.println("\nYour reverse value are");
        for (int i = num-1; i >= 0; i--) {
            System.out.print(ele[i] + " ");
        }
    }
}
