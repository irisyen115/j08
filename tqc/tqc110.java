class CShape {
    public static double calCircle(double r) {
        return r * r * 3.1415926;
    }

    public static double calTriangle(double b, double h) {
        return (b * h) / 2;
    }

    public static double calRectangle(double w, double h) {
        return w * h;
    }

}

public class tqc110 {
    public static void main(String[] args) {
        double carea = CShape.calCircle(5);
        double tarea = CShape.calTriangle(10, 5);
        double rarea = CShape.calRectangle(5, 10);
        System.out.println("圓形面積為: " + String.format("%.6f", carea));
        System.out.println("三角形面積為: " + String.format("%.6f", tarea));
        System.out.println("方形面積為: " + String.format("%.6f", rarea));
        System.out.println("圖形面積為: " + String.format("%.6f", (carea + tarea + rarea)));
    }
}
