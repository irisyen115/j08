package class09;

interface Math {
    public void show();

    public void add(int a, int b);

    public void sub(int a, int b);

    public void mul(int a, int b);

    public void div(int a, int b);
}

interface AdvancedMath {
    public void mod(int a, int b);

    public void fac(int a);

    public void pow(int a, int b);
}

class Compute implements Math, AdvancedMath {
    public int ans;

    public void show() {
        System.out.println("ans=" + ans);
    }

    public void add(int a, int b) {
        ans = a + b;
    }

    public void sub(int a, int b) {
        ans = a - b;
    }

    public void mul(int a, int b) {
        ans = a * b;
    }

    public void div(int a, int b) {
        ans = a / b;
    }

    public void mod(int a, int b) {
        ans = a % b;
    }

    public void fac(int a) {
        ans = a;
        for (int i = a - 1; i > 0; i--) {
            ans *= i;
        }
    }

    public void pow(int a, int b) {
        ans = a;
        for (int i = 0; i < b - 1; i++) {
            ans *= a;
        }
    }

}

public class class09 {
    public static void main(String[] args) {
        Compute cmp = new Compute();
        cmp.mod(14, 5);
        cmp.show();
        cmp.fac(4);
        cmp.show();
        cmp.pow(5, 3);
        cmp.show();
    }
}
