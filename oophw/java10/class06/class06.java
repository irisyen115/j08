package class06;

class CTriangle {
    protected int base;
    protected int height;

    protected CTriangle(int _base, int _height) {
        base = _base;
        height = _height;
    }

    protected void show() {
        System.out.println("base=" + base + ", height=" + height);
    }
}

// (a)
class CData extends CTriangle {

    CData(int _base, int _height) {
        super(_base, _height);
    }

    // (b)
    void area() {
        show();
        System.out.println("area=" + (double) (base * height) / 2);
    }
}

public class class06 {

    public static void main(String[] args) {
        // (c)
        CData obj = new CData(3, 8);
        obj.area();
    }
}