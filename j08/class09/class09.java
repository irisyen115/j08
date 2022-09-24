package class09;

class CCalculator {
    int a;
    int b;
    int c;

    // (a)
    void set_value(int x, int y, int z) {
        x = a;
        y = b;
        z = c;
    }

    // (b)
    void show() {
        System.out.println(a + "," + b + "," + c);
    }

    // (c)
    int add() {
        return a + b + c;
    }

    // (d)
    int sub() {
        return a - b - c;
    }

    // (e)
    int mul() {
        return a * b * c;
    }

    // (f)
    double avg() {
        double d = (a + b + c);
        return d / 3;
    }
}

public class class09 {
    public static void main(String[] args) {
        CCalculator test = new CCalculator();
        test.a = 25;
        test.b = 3;
        test.c = 7;
        test.set_value(25, 3, 7);
        test.show();
        System.out.println(test.add());
        System.out.println(test.sub());
        System.out.println(test.mul());
        System.out.println(test.avg());
    }
}