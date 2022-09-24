package class16;

class CSphere {
    private int x;
    private int y;
    private int z;
    private int radius;

    // (a)
    void setLocation(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    // (b)
    void setRadius(int r) {
        radius = r;
    }

    // (c)
    double surfaceArea() {
        return 4 * 3.14 * radius * radius;
    }

    // (d)
    double volumn() {
        return (double) 4 / 3 * 3.14 * radius * radius * radius;
    }

    // (d)
    void showCenter() {
        System.out.println("x=" + x + "," + "y=" + y + "," + "z=" + z);
    }
}

public class class16 {
    public static void main(String[] args) {
        CSphere sphere;
        sphere = new CSphere();

        sphere.setLocation(3, 4, 5);
        sphere.setRadius(1);

        System.out.println("surfaceArea=" + sphere.surfaceArea());
        System.out.println("volumn=" + sphere.volumn());
        sphere.showCenter();
    }
}
