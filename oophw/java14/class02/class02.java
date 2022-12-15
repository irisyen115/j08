package class02;

import java.util.Scanner;

/**
 * class02
 */
public class class02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入一列文字: ");
        String s = sc.nextLine();
        System.out.println("您輸入的文字轉大寫: " + s.toUpperCase());

        sc.close();
    }
}