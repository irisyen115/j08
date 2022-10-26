package class14;

interface iVolume {
    public void showData();

    public double vol();
}

abstract class CSphere implements iVolume {
    final double PI = 3.14;
    protected int x;
    protected int y;
}

// (b)
class CCircle extends CSphere {
    private int radious;

    CCircle(int _x, int _y, int _radious) {
        x = _x;
        y = _y;
        radious = _radious;
    }

    public void showData() {
        System.out.println("球心:(" + x + "," + y + ")");
        System.out.println("半徑:" + radious);
        System.out.println("球體積:" + vol());
    }

    public double vol() {
        return (double) 4 / 3 * PI * radious * radious * radious;
    }

}

public class class14 {
    public static void main(String[] args) {
        CCircle cir = new CCircle(8, 6, 2);
        cir.showData();
    }
}
// (a) 因為抽象類別不會真的產生物質，可以當作iVolume介面的延伸