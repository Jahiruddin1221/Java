public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;

    String[] enrollStudents = new String[maxCapacity];

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }
    void enrollStudents(String studentName) {
        enrollStudents[enrollments] = studentName;
        enrollments++;
    }
    void unenrollStudents(String studentName) {
        System.out.println("Student removed");
        enrollments--;
    }
}
