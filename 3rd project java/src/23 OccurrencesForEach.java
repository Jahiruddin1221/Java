import java.util.Scanner;

 class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = ArrayUtility.inputArray();
        System.out.print("Enter the number you want search: ");
        int element = input.nextInt();

        int result = OccurrencesFound(array, element);
        System.out.println("Your element found : " + result + " times");

    }
    public static int OccurrencesFound(int[] nums, int element) {
        int occ = 0;
        for (int num: nums) {
            if (num == element) {
                occ++;
            }
        }
        return occ;
    }
}
