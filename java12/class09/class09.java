package class09;

import class09.sub1.CSphere;
import class09.sub2.CTrapezoid;

public class class09 {
    public static void main(String[] args) {
        CSphere sphere = new CSphere(5);
        sphere.show();
        CTrapezoid trapezoid = new CTrapezoid(4, 3, 7);
        trapezoid.show();
    }
}
