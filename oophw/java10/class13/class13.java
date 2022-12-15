package class13;

class Caaa {
    public int num1;
    public int num2;

    public Caaa() {
        num1 = 1;
        num2 = 2;
    }

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
    public Cbbb() {
        super();
    }

    public Cbbb(int a, int b) {
        num1 = a;
        num2 = b;
    }
}

public class class13 {
    public static void main(String[] args) {
        Caaa caa = new Cbbb();
        caa.show();
    }
}
