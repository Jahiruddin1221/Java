import java.util.Scanner;

 class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks number: ");
        int marks = input.nextInt();

        String result =  marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("Your category is " + result);


    }
}
