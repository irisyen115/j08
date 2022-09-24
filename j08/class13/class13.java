package class13;

class CCircle {
    double pi = 3.14;

    // (a)
    double area(double r) {
        return r * r * pi;
    }

    // (b)
    // float ans =
    float area(float r) {
        double a = (r * r * pi);
        return (float) a;
    }

    // (c)
    double area(int r) {
        return (r * r * pi);
    }
}

public class class13 {
    public static void main(String[] args) {
        CCircle circle1;
        circle1 = new CCircle();
        System.out.println(circle1.area(2));
        System.out.println(circle1.area(2.2f));
        System.out.println(circle1.area(2.2));
    }
}
