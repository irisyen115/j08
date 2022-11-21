package class09.sub1;

public class CSphere {
    public double radious;

    public CSphere(double r) {
        this.radious = r;
    }

    public void show() {
        System.out.println("radious=" + radious);
        System.out.println("area=" + (double) 4 / 3 * 3.14 * radious * radious * radious);
    }
}
