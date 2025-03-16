import java.util.Scanner;

class Circle {
    double radius;

    Circle(double radius) {       // Constructor
        this.radius = radius;
    }
    double getCircumference() {
        return 2 * radius * Math.PI;   // C=2πr
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);  // A=πr^2
    }

     @Override
     public String toString() {
         return "Circle details: Radius: "+ radius +", Circumference: "
                                  + getCircumference() +", Area: "+ getArea() +",";
     }

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Please enter your radius: ");
         double radius = input.nextDouble();
         Circle circle = new Circle(radius);
         System.out.println(circle);
     }
 }
