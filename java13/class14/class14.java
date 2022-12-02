package class14;

import java.util.Scanner;

class IntegerTooSmall extends Exception {
}

class IntegerTooLarge extends Exception {
}

class InputMismatchException extends Exception {
}

class Cint {
    String a;

    public static void test(String a) throws IntegerTooSmall, IntegerTooLarge, InputMismatchException {
        try {
            int ai = Integer.parseInt(a);
            if (ai < 10) {
                throw new IntegerTooSmall();
            } else if (ai > 70) {
                throw new IntegerTooLarge();
            }
        } catch (NumberFormatException e) {
            throw new InputMismatchException();
        }
    }
}

public class class14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        // (c)
        try {
            Cint.test(a);
            System.out.println(a);
            // (a)
        } catch (IntegerTooSmall e) {
            System.out.println("您輸入的整數的值太小");
            // (b)
        } catch (IntegerTooLarge e) {
            System.out.println("您輸入的整數的值太大");
            // (d)
        } catch (InputMismatchException e) {
            System.out.println("您輸入的不是整數");
        }
        sc.close();
    }
}
