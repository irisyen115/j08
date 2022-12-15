package class03;

class Caaa {
    public int num1;
    public int num2;

    // (a)
    public Caaa() {
        num1 = 1;
        num2 = 1;
    }

    // (b)
    public Caaa(int a, int b) {
        num1 = a;
        num2 = b;
    }

    void show() {
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }
}

class Cbbb extends Caaa {
    // (c)
    public Cbbb(int a, int b) {
        super(a, b);
    }
}

public class class03 {
    public static void main(String[] args) {
        // (d)
        new Caaa().show(); // d-(a)
        new Caaa(3, 9).show(); // d-(b)
        new Cbbb(2, 5).show(); // d-(c)
    }
}
