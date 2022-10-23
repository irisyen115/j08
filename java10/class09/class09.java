package class09;

class Caaa {
    private int num;

    public int get() {
        return num;
    }

    // (a)
    void display() {
        System.out.println("printed from Caaa class");
    }
}

class Cbbb extends Caaa {

    public void show() {
        System.out.println("num=" + get());
    }

    // (b)
    void display() {
        System.out.println("printed from Cbbb class");
    }
}

public class class09 {
    public static void main(String[] args) {
        Caaa bb = new Cbbb();
        bb.display();
    }
}
// (c)先呼叫子類別