package class07;

public class class07 {
    public static void test(int a, int b) throws ArithmeticException {
        int c = a / b;
        System.out.println(a + "/" + b + "=" + c);
    }

    public static void main(String args[]) {
        int num = 12, den = 0;
        try {
            test(num, den);
        } catch (ArithmeticException e) {
            System.out.println(e + " throwed");
        }
        System.out.println("end of main()!!");
    }
}
