package class12;

class CShape {
    protected int num;

    protected double area() {
        return 0.0;
    }

    CShape(int _num) {
        num = _num;
    }

    static void largest(CShape[] shapes) {
        double max = -1;
        int maxi = 0;
        String[] shape = { "Circle", "Square", "Triangle" };
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].area() > max) {
                max = shapes[i].area();
                maxi = i;
            }
        }
        System.out.println(shape[maxi] + " " + maxi + " is max area");
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

public class class12 {
    public static void main(String[] args) {
        CShape shp[] = new CShape[5];
        shp[0] = new CCircle(50);
        shp[1] = new CCircle(21);
        shp[2] = new CSquare(15);
        shp[3] = new CTriangle(12, 7);
        shp[4] = new CTriangle(3, 18);
        CShape.largest(shp);
    }
}
