package class16;

class CCircle {
    private static double pi = 3.14;
    private double radius;

    public CCircle(double r) {
        radius = r;
    }

    public static void show(CCircle c[]) {
        for (int i = 0; i < c.length; i++) {
            System.out.println(pi * c[i].radius * c[i].radius);
        }
    }
}

public class class16 {
    public static void main(String[] args) {
        CCircle cir[];
        cir = new CCircle[6];
        for (int i = 0; i < cir.length; i++) {
            cir[i] = new CCircle(i);
        }

        CCircle.show(cir);
    }
}
