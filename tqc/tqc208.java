import java.util.Scanner;

public class tqc208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Input:");
            int a = sc.nextInt();
            if (a >= 90) {
                System.out.println("Your grade is A");
            } else if (a < 90 && a >= 80) {
                System.out.println("Your grade is B");
            } else if (a < 80 && a >= 70) {
                System.out.println("Your grade is C");
            } else if (a < 70 && a >= 60) {
                System.out.println("Your grade is D");
            } else if (a < 60) {
                System.out.println("Your grade is F");
            }
        }
        sc.close();
    }
}
