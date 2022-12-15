package class03;

import java.util.Scanner;

public class class03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入一個正整數: ");
        int n = sc.nextInt();
        System.out.println("1 + 2 + ... + n = " + ((1 + n) * n) / 2);

        sc.close();
    }
}
