package class07;

public class class07 {
    public static void main(String[] args) {
        System.out.println(power((int) (power(2, 5)), (int) (power(3, 2))));
    }

    public static long power(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else {
            return x * power(x, n - 1);
        }
    }
}
