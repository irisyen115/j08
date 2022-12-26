import java.util.Scanner;

public class tqc310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("請輸入n的值(n > 0，且為偶數)");
            n = sc.nextInt();
        } while (n < 0 || n % 2 != 0);
        System.out.println("2+4+6+...+" + n + "=" + ((2 + n) * ((n - 2) / 2 + 1)) / 2);
        sc.close();
    }
}
