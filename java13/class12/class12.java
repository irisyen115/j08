package class12;

import java.util.Arrays;

class NotTriangle extends Exception {
}

class EquilateralTriangle extends Exception {
}

class NotEquilateralTriangle extends Exception {
}

class CTriangle {
    int a;
    int b;
    int c;

    public static void triangle(int a, int b, int c) throws NotTriangle, EquilateralTriangle, NotEquilateralTriangle {
        int[] t = { a, b, c };
        Arrays.sort(t);
        if ((t[0] + t[1]) < t[2]) {
            throw new NotTriangle();
        } else if (a == b && a == c && b == c) {
            throw new EquilateralTriangle();
        } else {
            throw new NotEquilateralTriangle();
        }
    }
}

public class class12 {
    public static void main(String args[]) {
        try {
            CTriangle.triangle(1, 5, 2);
            // (a)
        } catch (NotTriangle e) {
            System.out.println("不構成三角形");
            // (b)
        } catch (EquilateralTriangle e) {
            System.out.println("這是正三角形");
            // (c)
        } catch (NotEquilateralTriangle e) {
            System.out.println("這不是正三角形");
        }
    }
}
