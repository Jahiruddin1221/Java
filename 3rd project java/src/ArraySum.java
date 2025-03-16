public class ArraySum {
    public static void main(String[] args) {
        float[] marks = {2.3f, 5.3f, 8.2f, 8.6f, 4.6f};
        float sum = 0;
        for (float element:marks) {
            sum = sum + element;

        }
        System.out.println("The value of is" + sum);
    }
}
