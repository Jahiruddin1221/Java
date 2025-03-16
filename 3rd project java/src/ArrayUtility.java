import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter element no " + (i + 1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;

    }

    public static void displayArray(int[] numArray) {
        int i = 0;
        while (i < numArray.length) {
            System.out.println(numArray[i] + "");
            i++;
        }
    }

    public static int[] inputNum() {
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
        return ele;
    }
    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter number of column: ");
        int column = input.nextInt();
        int[][] numArray = new int[row][column];

        int i = 0;
        while (i < row) {
            int j = 0;
            while (j < column) {
                System.out.print("Enter rows:" + (i + 1) + " column:" + (j + 1) + " ");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        System.out.println("The array is");
        i = 0;
        while (i < row) {
            int j = 0;
            while (j < column) {
                System.out.print(numArray[i][j] + " ");

                j++;
            }
            System.out.println();

            i++;
        }

        return numArray;
    }

}
