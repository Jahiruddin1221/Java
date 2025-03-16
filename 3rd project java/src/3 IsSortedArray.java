 class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to sorted table\n");
        int[] numArr = ArrayUtility.inputArray();

        boolean IsInc = IsIncreasing(numArr);
        boolean IsDec = IsDecreasing(numArr);
        if (IsInc || IsDec) {
            System.out.println("Your array is sorted");
        } else {
            System.out.println("Your array is not sorted");
        }

    }
    public static boolean IsIncreasing(int[] num) {
        int i = 1;
        while (i < num.length) {
            if (num[i] < num[i-1]) {          // 1, 2, 3, 2, 5 -- false
                return false;
            }
            i++;
        }

        return true;
    }
    public static boolean IsDecreasing(int[] num) {
        int i = 1;
        while (i < num.length) {
            if (num[i] > num[i-1]) {          // 7, 6, 5, 7, 3 -- false
                return false;
            }
            i++;
        }
        return true;
    }
}
