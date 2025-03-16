 class MaxMimArry {
    public static void main(String[] args) {
        System.out.println("Welcome to maximum and minimum\n");
        int[] numArr = ArrayUtility.inputArray();
        int max = max(numArr);
        int min = min(numArr);
        System.out.println("Your maximum value is " + max);
        System.out.println("Your maximum value is " + min);

    }
    public static int min(int[] num) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < num.length) {
            if (min > num[i]) {
                min = num[i];
            }
            i++;
        }
        return min;
    }
    public static int max(int[] num) {
        int max = num[0];
        int i = 1;
        while (i < num.length) {
            if (max < num[i]) {
                max = num[i];
            }
            i++;
        }
        return max;
    }
}
