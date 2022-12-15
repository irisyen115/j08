package class15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ArgumentOutOfBound extends Exception {
}

public class class15 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input a Integer: ");
        int n = Integer.parseInt(buf.readLine());
        try {
            mySqrt(n);
        } catch (ArgumentOutOfBound e) {
            System.out.println(n + "小於0");
        }
    }

    public static void mySqrt(int n) throws ArgumentOutOfBound {
        if (n < 0) {
            throw new ArgumentOutOfBound();
        }
        System.out.println("mySqrt=" + Math.sqrt(n));
    }
}
