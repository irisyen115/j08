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
        char arr[] = a.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (!Character.isDigit(arr[i])) {
                throw new InputMismatchException();
            }
        }
        if (Integer.parseInt(a) < 10) {
            throw new IntegerTooSmall();
        } else if (Integer.parseInt(a) > 70) {
            throw new IntegerTooLarge();
        } else {
            System.out.println(a);
        }
    }
}

public class class14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        try {
            Cint.test(a);
        } catch (IntegerTooSmall e) {
            System.out.println("您輸入的整數的值太小");
        } catch (IntegerTooLarge e) {
            System.out.println("您輸入的整數的值太大");
        } catch (InputMismatchException e) {
            System.out.println("您輸入的不是整數");
        }
    }
}
