package class11;

class CShape {
    protected int num;

    protected double area() {
        return 0.0;
    }

    CShape(int _num) {
        num = _num;
    }

    static void largest(double cir, double squ, double tri) {
        double[] sha = { cir, squ, tri };
        double max = -1;
        for (int i = 0; i < sha.length; i++) {
            if (sha[i] > max) {
                max = sha[i];
            }
        }
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
    protected double pi = 3.14;

    CCircle(int _num) {
        super(_num);
    }

    public double area() {
        return num * num * pi;
    }
}

class CSquare extends CShape {

    CSquare(int _num) {
        super(_num);
    }

    public double area() {
        return num * num;
    }
}

class CTriangle extends CShape {
    private int height;

    CTriangle(int _num, int _height) {
        super(_num);
        height = _height;

    }

    public double area() {
        return (num * height) / 2;
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