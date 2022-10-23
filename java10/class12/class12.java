package class12;

class CShape {
    protected String name;

    protected double area() {
        return 0.0;
    }

    protected String getName() {
        return name;
    }

    static void largest(CShape[] shapes) {
        double max = -1;
        CShape maxShape = null;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].area() > max) {
                max = shapes[i].area();
                maxShape = shapes[i];
            }
        }
        System.out.println("max area=" + maxShape.getName() + " " + max);
    }
}

class CCircle extends CShape {
    private static double pi = 3.14;
    private int radius;

    CCircle(int _num) {
        radius = _num;
        name = "Circle";
    }

    public double area() {
        return radius * radius * pi;
    }
}

class CSquare extends CShape {
    private int edge;

    CSquare(int _num) {
        edge = _num;
        name = "Square";
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
        name = "Triangle";
    }

    public double area() {
        return (base * height) / 2;
    }
}

public class class12 {
    public static void main(String[] args) {
        /* 少一個 XD */
        CShape shp[] = new CShape[6];
        shp[0] = new CCircle(50);
        shp[1] = new CCircle(21);
        shp[2] = new CSquare(15);
        shp[3] = new CSquare(15);
        shp[4] = new CTriangle(12, 7);
        shp[5] = new CTriangle(3, 18);
        CShape.largest(shp);
    }
}
