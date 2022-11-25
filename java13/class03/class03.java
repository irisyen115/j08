package class03;

public class class03 {
    public static void main(String[] args) {
        try {
            int num = 12, den = 0;
            int ans = num / den;
        } catch (ArithmeticException e) {
            System.out.println("divide by zero");
        } finally {
            System.out.println("end of main() method");
        }
    }
}
