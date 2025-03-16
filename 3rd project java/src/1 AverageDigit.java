class AverageDigit {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sum and Average");
        int[] numArr = ArrayUtility.inputArray();
        long sum = sum(numArr);
        double avg = average(numArr);
        System.out.println("Sum of the number is " + sum);
        System.out.println("Average of the number is " + avg);

    }
    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum = sum + numArray[i];
            i++;
        }
        return sum;
    }
    public static double average(int[] num) {
        double sum = sum(num);
        return (sum / num.length);
    }
}
