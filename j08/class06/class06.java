package class06;

class CCircle {
    double pi = 3.14;
    double radius;

    // (c)
    void setRadius(double r) {
        radius = r;
    }

    void show_periphery() {
        System.out.println("periphery=" + 2 * pi * radius);
    }
}

public class class06 {
    public static void main(String[] args) {
        // (a) (b)
        CCircle cir1 = new CCircle();
        cir1.radius = 3.0;
        System.out.println("radius=" + cir1.radius);

        cir1.setRadius(5.0);
        // (d)
        cir1.show_periphery();
    }
}