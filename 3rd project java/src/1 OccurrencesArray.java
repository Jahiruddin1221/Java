import java.util.Scanner;

 class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Occurrences\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Please enter the number that you want to find: ");
        int num = input.nextInt();
        int result = noOfOccurrences(numArr, num);
        System.out.print("Your element was found " + result + " times");


    }
    public static int noOfOccurrences(int[] numArr, int num) {
        int occ = 0;
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] == num) {
                occ++;

            }
            i++;
        }
        return occ;
    }
}
