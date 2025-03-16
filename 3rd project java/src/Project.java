import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: Input matrices
        System.out.print("Enter the rows and columns of the matrix A: ");
        int aRows = scanner.nextInt();
        int aColumns = scanner.nextInt();

        int[][] a = new int[aRows][aColumns];
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < aColumns; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the rows and columns of the matrix B: ");
        int bRows = scanner.nextInt();
        int bColumns = scanner.nextInt();

        if (bRows != aColumns) {
            System.out.println("Sorry! We cannot multiply the matrices A and B.");
            return;
        }

        int[][] b = new int[bRows][bColumns];
        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < bRows; i++) {
            for (int j = 0; j < bColumns; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        // Part 2: Matrix multiplication
        int[][] product = new int[aRows][bColumns];
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bColumns; j++) {
                int sum = 0;
                for (int k = 0; k < bRows; k++) {
                    sum += a[i][k] * b[k][j];
                }
                product[i][j] = sum;
            }
        }

        // Part 3: Print the resultant matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bColumns; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}