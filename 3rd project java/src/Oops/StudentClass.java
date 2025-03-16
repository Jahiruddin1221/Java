package Oops;

import java.lang.Class;
import java.util.Scanner;

public class StudentClass {
    // data type
    public static class Student {
        String name;
        private int rollNumber;
        int age;
        // We can not change final value
        final String SchoolName;
        static int numOfStudend;

         public Student(String name, int rollNumber, int age, String SchoolName) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.age = age;
            this.SchoolName = SchoolName;
            numOfStudend++;
        }
    }
    public static void main(String[] args) {
        Student x = new Student("jahir", 50, 21, "HGP");           // dabba

//      x.SchoolName = "Hilli";  We can not use this value in final
        System.out.println(x.name);
        System.out.println(x.SchoolName);
        System.out.println(x.numOfStudend);
        Student x1 = new Student("rohan", 50, 21, "HGP");
        System.out.println(x1.numOfStudend);
        Student x2 = new Student("rohan", 50, 21, "HGP");
        System.out.println(x2.numOfStudend);
    }
}
