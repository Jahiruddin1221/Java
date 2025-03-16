 class StudentDetails {
    String name;
    int age;
    String rollNumber;
    String house;

     public StudentDetails(String name, int age, String rollNumber, String house) {    // Constructor
         this.name = name;
         this.age = age;
         this.rollNumber = rollNumber;
         this.house = house;
     }

     @Override
     public String toString() {
         return "Student Details: {name:"+ name +", age:"+ age +", roll number:"+ rollNumber +", house:"+ house +",}";
     }

     public static void main(String[] args) {
         StudentDetails stu = new StudentDetails("Jahir", 20, "0245DCS114", "Amaipur");
         System.out.println(stu);
     }
 }





