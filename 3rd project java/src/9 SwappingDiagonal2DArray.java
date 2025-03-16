 class SwappingDiagonal2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to swapping diagonal\n");
        int[][] numArr = ArrayUtility.input2DArray();
        int saw = display(numArr);
        System.out.println(saw);

    }
    public static int swapping(int[][] num) {
        int i = 0;
        while (i < num.length) {

            int temp = num[i][i];
            num[i][i] = num[i][num.length - 1 - i];
            num[i][num.length - 1 - i] = temp;
            i++;
        }
        return 0;

    }
    public static int display(int[][] numArr) {
        int loc = swapping(numArr);
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr.length) {
                System.out.print(numArr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        return loc;
    }
}
