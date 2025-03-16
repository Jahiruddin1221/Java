import java.util.Scanner;

 class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number number: ");
        int num = input.nextInt();

        AbsoluteTernary ternary = new AbsoluteTernary();    // also static method
        int result = ternary.absolute(num);
        System.out.println("Absolute value is " + result);
    }
    public int absolute(int num) {
        return num >= 0 ? num : -num;

    }
}
