import java.util.Scanner;

class MonthYearSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your month number: ");
        int month = input.nextInt();

        String result = monthName(month);
        System.out.println("Your month name is " + result);
    }

    public static String monthName(int num) {
        return switch (num) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4-> "April";
            case 5 -> "may";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12-> "December";

            default -> "Invalid input";
        } ;
    }
}

