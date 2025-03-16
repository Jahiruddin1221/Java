 class MathClass {
     public static void main(String[] args) {
         System.out.println(Math.abs(-99));      // 99
         System.out.println(Math.ceil(5.3));     // 6.0
         System.out.println(Math.floor(4.3));     // 5.0
         System.out.println(Math.round(5.32));    // 5.0
         System.out.println(Math.round(5.72));    // 6.0
         System.out.println(Math.random());  // 0 - 10 any random number
         System.out.println(Math.PI);     // Real PI value

         String name = "Jahir";
                 int num = 30;
         System.out.print("Hello " + name + " your marks is " + num);  // Hello Jahir your marks is 30
         System.out.printf("Hello %s your marks is %d", name, num); // Hello Jahir your marks is 30
         System.out.printf("Hello %10S your marks is %d", name, num);  // Hello      JAHIR your marks is 30
         System.out.printf("Hello %-10S your marks is %d", name, num);  // Hello JAHIR      your marks is 30
     }
}
