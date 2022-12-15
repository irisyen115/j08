package class11;

class CShape {
    protected double area() {
        return 0.0;
    }

    static void largest(double cir, double squ, double tri) {
        double max = Math.max(Math.max(cir, squ), tri);

        System.out.println("max area=" + max);
    }

    static double largest(CCircle circle1, CCircle circle2) {
        return Math.max(circle1.area(), circle2.area());
    }

    static double largest(CSquare square1, CSquare square2) {
        return Math.max(square1.area(), square2.area());
    }

    static double largest(CTriangle triangle1, CTriangle triangle2) {
        return Math.max(triangle2.area(), triangle2.area());
    }
}

class CCircle extends CShape {
    private static double pi = 3.14;
    private int radius;

    CCircle(int _num) {
        radius = _num;
    }

    public double area() {
        return radius * radius * pi;
    }
}

class CSquare extends CShape {
    private int edge;

    CSquare(int _num) {
        edge = _num;
    }

    public double area() {
        return edge * edge;
    }
}

class CTriangle extends CShape {
    private int base;
    private int height;

    CTriangle(int _num, int _height) {
        base = _num;
        height = _height;

    }

    public double area() {
        return (base * height) / 2;
    }
}

public class class11 {
    public static void main(String[] args) {
        CCircle circle1 = new CCircle(5);
        CCircle circle2 = new CCircle(10);
        CSquare square1 = new CSquare(2);
        CSquare square2 = new CSquare(33);
        CTriangle triangle1 = new CTriangle(2, 5);
        CTriangle triangle2 = new CTriangle(12, 23);
        CShape.largest(CShape.largest(circle1, circle2), CShape.largest(square1, square2),
                CShape.largest(triangle1, triangle2));
    }
}
// (e) 一個一個找，的確非常不方便