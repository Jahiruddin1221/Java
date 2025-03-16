 class MaximumArray {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
        for (int num: array) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println("Your maximum value is " + max);
    }
}
