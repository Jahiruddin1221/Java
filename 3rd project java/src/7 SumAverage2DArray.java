 class SumAverage2DArray {
    public static void main(String[] args) {
        int[][] numArr = ArrayUtility.input2DArray();

        long sum = sum(numArr);
        double avg = avg(numArr);
        System.out.println("Your sum is " + sum);
        System.out.println("Your average is " + avg);

    }

    public static long sum(int[][] numArr) {
        int sum = 0;                          // Sum of all element
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                sum = sum + numArr[i][j];
                j++;
            }
            i++;
        }

        return sum;
    }

    public static double avg(int[][] num) {
        int row = num.length;                      // Average of all element
        int column = num.length;

        double sum = sum(num);
        double size = row * column;
        return sum / size;
    }
}
