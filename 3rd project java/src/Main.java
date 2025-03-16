import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {5, 9, 6, 3, 7, 8, 1};
        System.out.println("Enter number you want to search");
        int num = input.nextInt();

        boolean result = isFound(arr, num);
        if (result) {
            System.out.println("Your number was found");
        } else {
            System.out.println("Your number was not found");
        }


    }
    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}