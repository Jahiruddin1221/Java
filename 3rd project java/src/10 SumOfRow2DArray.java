 class SumOfRow2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of Row");
        int[][] numArr = ArrayUtility.input2DArray();
        rowSum(numArr);

    }
    public static int rowSum(int[][] numArr) {
        // int sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int sum = 0;
            int j = 0;
            while (j < numArr.length) {
                sum = sum + numArr[i][j];
                j++;
            }                                           // Input only even row and column
            System.out.println("Sum of row " + (i+1) + ": " + sum);
            i++;
        }
        return 0;
    }
}
