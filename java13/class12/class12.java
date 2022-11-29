package class12;

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
        if ((a + b) < c || (a + c) < b | (b + c) < a) {
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
            CTriangle.triangle(3, 3, 3);
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
