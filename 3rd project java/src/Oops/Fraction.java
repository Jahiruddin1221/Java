package Oops;
// Fraction multiplication (5/10 * 10/100 == 3/5)

public class Fraction {
    public static fraction add(fraction f1, fraction f2) {
        int nue = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int due = f1.denominator * f2.denominator;
        fraction f3 = new fraction(nue, due);
        return f3;
    }
    public static class fraction {
        int numerator;
        int denominator;

        // Constructor
        public fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
            sipliify();
        }

        // Method  10/5
        public void sipliify() {
            if (numerator < denominator) {
                if (denominator % numerator == 0) {
                    denominator /= numerator;
                    numerator = 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        fraction f1 = new fraction(5, 10);
        System.out.println(f1.numerator + "/" + f1.denominator);
        fraction f2 = new fraction(10, 100);
        System.out.println(f2.numerator + "/" + f2.denominator);
        fraction f3 = add(f1, f2);
        System.out.println(f3.numerator + "/" + f3.denominator);

    }
}
