package class09.sub2;

public class CTrapezoid {
    public int upper;
    public int base;
    public int height;

    public CTrapezoid(int u, int b, int h) {
        this.upper = u;
        this.base = b;
        this.height = h;
    }

    public void show() {
        System.out.println("upper=" + upper);
        System.out.println("base=" + base);
        System.out.println("height=" + height);
        System.out.println("area=" + (double) ((upper + base) * height) / 2);
    }
}
