import java.util.Scanner;

 class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num = input.nextInt();

        OddEvenTernary ternary = new OddEvenTernary();  // also static method
        String result = ternary.oddEven(num);
        System.out.println("Your number is " + result);
    }
    public String oddEven(int num) {
        return num % 2 == 0 ? "even" : "odd";
    }
}
