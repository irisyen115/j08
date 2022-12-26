import java.util.Scanner;

public class tqc402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n >= 0) {
            System.out.println("Input n (0 <= n <= 16):");
            n = sc.nextInt();
            if (n == 999) {
                break;
            }
            if (n > 16) {
                continue;
            } else {
                int count = 1;
                for (int i = 1; i < n + 1; i++) {
                    count *= i;
                }
                System.out.println(n + "的階乘(尾端遞迴) = " + fac(n));
                System.out.println(n + "的階乘(迴圈) = " + count);
            }
        }
        sc.close();
    }

    public static int fac(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }
}
