class CShape {
    public static String calCircle() {
        return String.format("%.6f", (5 * 5 * 3.1415926));
    }

    public static String calTriangle() {
        return String.format("%.6f", (double) ((10 * 5) / 2));
    }

    public static String calRectangle() {
        return String.format("%.6f", (double) (5 * 10));
    }

    public static String show() {
        return String.format("%.6f", (5 * 5 * 3.1415926) + (double) ((10 * 5) / 2) + (double) (5 * 10));
    }
}

public class tqc110 {
    public static void main(String[] args) {
        System.out.println("圓形面積為: " + CShape.calCircle());
        System.out.println("三角形面積為: " + CShape.calTriangle());
        System.out.println("方形面積為: " + CShape.calRectangle());
        System.out.println("圖形面積為: " + CShape.show());
    }
}
