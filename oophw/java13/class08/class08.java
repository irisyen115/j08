package class08;

class Ctest {
    public static void test(int a, int b) throws ArithmeticException {
        int c = a / b;
        System.out.println(a + "/" + b + "=" + c);
    }
}

public class class08 {
    public static void main(String args[]) {
        int num = 12, den = 0;
        try {
            Ctest.test(num, den);
        } catch (ArithmeticException e) {
            System.out.println(e + " throwed");
        }
        System.out.println("end of main()!!");
    }
}
