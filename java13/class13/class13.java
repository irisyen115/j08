package class13;

import java.util.Scanner;

class Exception520 extends Exception {
}

class Ctest {
    String s;

    public static void test(String s) throws Exception520 {
        if (s.equals("520")) {
            throw new Exception520();
        } else {
            System.out.println(s);
        }
    }
}

public class class13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try {
            Ctest.test(s);
        } catch (Exception520 e) {
            System.out.println("這是由字串 520所引起的例外");
        }
    }
}
