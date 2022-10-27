package class14;

interface iVolume {
    public void showData();

    public double vol();
}

abstract class CSphere implements iVolume {
    final double PI = 3.14;
    protected int x;
    protected int y;

    // (c)
    public abstract void showData();

    public abstract double vol();
}

// (a)
class CCircle extends CSphere {
    private int radius;

    CCircle(int _x, int _y, int _radius) {
        x = _x;
        y = _y;
        radius = _radius;
    }

    public void showData() {
        System.out.println("球心:(" + x + "," + y + ")");
        System.out.println("半徑:" + radius);
        System.out.println("球體積:" + vol());
    }

    public double vol() {
        return (double) 4 / 3 * PI * radius * radius * radius;
    }
}

public class class14 {
    public static void main(String[] args) {
        CCircle cir = new CCircle(8, 6, 2);
        cir.showData();
    }
}
// (b) 因為abstract class 不會真的產生物件，可以把CSphere當作iVolume interface 的延伸