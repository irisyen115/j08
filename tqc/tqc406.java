import java.util.Scanner;

public class tqc406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Input a string: ");
            String s = sc.nextLine();
            System.out.println(s + " has " + findA(s) + " As");
        }
        sc.close();
    }

    public static int findA(String s) {
        if (s.length() == 0) {
            return 0;
        } else {
            return ((s.charAt(0) == 'A') ? 1 : 0) + findA(s.substring(1, s.length()));
        }
    }
}
