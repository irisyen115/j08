import java.util.Scanner;

public class tqc204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Input:");
            int a = sc.nextInt();
            if (a % 5 == 0 && a % 9 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
