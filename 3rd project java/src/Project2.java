import java.util.Scanner;

// Matrix multiplication.

public class Project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aRows, aColumn, bRows, bColumn;
        int i, j, k;

        // input matrix A
        System.out.println("Enter rows and columns of matrix A: ");
        aRows = input.nextInt();
        aColumn = input.nextInt();

        int[][] a = new int[aRows][aColumn];
        System.out.println("Enter rows: ");
        for (i = 0; i < aRows; i++) {
            for (j = 0; j < aColumn; j++) {
                a[i][j] = input.nextInt();

            }
        }
        // input matrix B
        System.out.println("Enter rows and columns of matrix B: ");
        bRows = input.nextInt();
        bColumn = input.nextInt();

        if (aColumn != bRows) {
            System.out.println("Sorry! We can not multiply your matrix A and B");
            System.out.println("Please enter same rows and columns for matrix A and matrix B ");
            return;
        }

        int[][] b = new int[bRows][bColumn];
        System.out.println("Enter rows: ");
        for (i = 0; i < bRows; i++) {
            for (j = 0; j < bColumn; j++) {
                b[i][j] = input.nextInt();
            }
        }
        int[][] product = new int[aRows][bColumn];
        for (i = 0; i < aRows; i++) {
            for (j = 0; j < bColumn; j++) {
               int sum = 0;
               for (k = 0; k < bRows; k++) {
                   sum += a[i][k] * b[j][k];
                   product[i][j] = sum;
               }
            }
        }
        // Result
        System.out.println("your result: ");
        for (i = 0; i < aRows; i++) {
            for (j = 0; j < bColumn; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
