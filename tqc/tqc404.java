import java.util.Scanner;

public class tqc404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        while (m >= 0) {
            System.out.print("Input m: ");
            m = sc.nextInt();
            if (m == 999) {
                break;
            }
            System.out.print("Input n: ");
            int n = sc.nextInt();
            System.out.println("最大公因數為: " + gcd(m, n));
        }
        sc.close();
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
}
