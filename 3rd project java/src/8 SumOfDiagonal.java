 class SumOfDiagonal {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of diagonal\n");
        int[][] numArr = ArrayUtility.input2DArray();
        int liftSum = liftSum(numArr);
        int rightSum = rightSum(numArr);
       int resulr = liftSum + rightSum;
        System.out.println("Your liftSum is " + liftSum);
        System.out.println("Your rightSum is " + rightSum);
        System.out.println("Your total sum is " + resulr);

    }
    public static int liftSum(int[][] numArr) {
        int liftSum = 0;
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                if (i == j) {
                    liftSum = liftSum + numArr[i][j];
                }
                j++;
            }
            i++;
        }
        return liftSum;             // Input only even row and column
    }
    public static int rightSum(int[][] numArr) {
        int rightSum = 0;
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                if (i + j == numArr.length - 1) {
                    rightSum = rightSum + numArr[i][j];
                }
                j++;
            }
            i++;
        }
        return rightSum;
    }
}
